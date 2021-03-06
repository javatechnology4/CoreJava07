package com.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringHibernateMain {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\Eclipse_Workspaces\\FullStackTraining\\Core07\\src\\com\\spring\\hibernate\\Spring_Hibernate_application.xml");
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		Employee emp = new Employee();
		emp.setId(new Long(48));
		emp.setName("Transaction_123");
		emp.setEmpCode("TR789_87");
		emp.setJobRole("TransactionManager_74");
		System.out.println(service.saveEmployee(emp));
		/*Employee loadEmployee = service.loadEmployee(3);
		System.out.println(loadEmployee.getEmpCode());
		System.out.println(loadEmployee.getJobRole());
		System.out.println(loadEmployee.getName());
		System.out.println(loadEmployee.getId());*/

	}

}
