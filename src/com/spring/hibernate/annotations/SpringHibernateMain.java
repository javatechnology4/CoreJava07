package com.spring.hibernate.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringHibernateMain {

	public static void main(String[] args) {
		/*ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\Eclipse_Workspaces\\FullStackTraining\\Core07\\src\\com\\spring\\hibernate\\Spring_Hibernate_application.xml");*/
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringHibernateConfiguration.class);
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		Employee emp = new Employee();
		emp.setId(new Long(58));
		emp.setName("Spring");
		emp.setEmpCode("SP2013");
		emp.setJobRole("Lead Developer");
		System.out.println(service.saveEmployee(emp));
		/*Employee loadEmployee = service.loadEmployee(3);
		System.out.println(loadEmployee.getEmpCode());
		System.out.println(loadEmployee.getJobRole());
		System.out.println(loadEmployee.getName());
		System.out.println(loadEmployee.getId());*/

	}

}
