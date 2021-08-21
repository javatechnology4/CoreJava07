package com.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class SpringMain {

	public static void main(String[] args) {
		/*BeanFactory factory =new XmlBeanFactory(new ClassPathResource("application.xml"));
		GreetingService bean = (GreetingService)factory.getBean("greetingService");
		bean.sayGreeting();*/
		//ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		ApplicationContext context=new FileSystemXmlApplicationContext("C:\\Users\\Suresh\\Downloads\\Eclipse_workspace\\Core07\\src\\application.xml");
		
		//GreetingService bean2 = factory.getBean(GreetingService.class);
		//GreetingService bean3 = factory.getBean("greetingService", GreetingService.class);
		//System.out.println(factory.isTypeMatch("greetingService", GreetingService.class));
		//for(String str:factory.getAliases("greetingService"))
			//System.out.println(str);
		//System.out.println(factory.isSingleton("greetingService"));
		//bean3.sayGreeting();
		//bean2.sayGreeting();
		//bean.sayGreeting();
		/*Table tab=(Table)context.getBean("table");
		tab.table();*/
		Performer per=(Performer)context.getBean("performer");
		try {
			per.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
