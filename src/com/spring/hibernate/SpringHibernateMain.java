package com.spring.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringHibernateMain {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext(
				"D:\\Eclipse_Workspaces\\FullStackTraining\\Core07\\src\\com\\spring\\hibernate\\Spring_Hibernate_application.xml");
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		Employee emp = new Employee();
		emp.setId(new Long(3));
		emp.setName("Spring_Update");
		emp.setEmpCode("HB4552");
		emp.setJobRole("Sr Developer");
		System.out.println(service.saveEmployee(emp));
		/*Employee loadEmployee = service.loadEmployee(3);
		System.out.println(loadEmployee.getEmpCode());
		System.out.println(loadEmployee.getJobRole());
		System.out.println(loadEmployee.getName());
		System.out.println(loadEmployee.getId());*/

	}

}
