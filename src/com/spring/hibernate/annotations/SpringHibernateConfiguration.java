package com.spring.hibernate.annotations;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "com.spring.hibernate.annotations")
@PropertySource(value = "classpath:hibernate.properties")
@EnableTransactionManagement
public class SpringHibernateConfiguration {// <Beans>
	@Autowired
	private Environment env;

	@Bean
	public DataSource getDataSource() {// <bean>
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("hibernate.connection.driver_class"));
		dataSource.setUrl(env.getProperty("hibernate.connection.url"));
		dataSource.setUsername(env.getProperty("hibernate.connection.username"));
		dataSource.setPassword(env.getProperty("hibernate.connection.password"));
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factory = new LocalSessionFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setMappingResources("Employee.hbm.xml"); 
		Properties hibernateProperties = new Properties(); 
		hibernateProperties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
		hibernateProperties.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
		hibernateProperties.put("hibernate.default_schema", env.getProperty("hibernate.default_schema"));
		hibernateProperties.put("hibernate.current_session_context_class", env.getProperty("hibernate.current_session_context_class"));
		//hibernateProperties.put("hibernate.transaction.factory_class", env.getProperty("hibernate.transaction.factory_class"));
		factory.setHibernateProperties(hibernateProperties);
		return factory;
	}

	/*@Bean
	
	public HibernateTemplate getHibernateTemplate(SessionFactory factory) {
		HibernateTemplate template = new HibernateTemplate();
		template.setSessionFactory(factory);
		return template;
	}*/
	@Bean
	@Autowired
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager manager=new HibernateTransactionManager();
		manager.setSessionFactory(sessionFactory);
		return manager;
	}

}
