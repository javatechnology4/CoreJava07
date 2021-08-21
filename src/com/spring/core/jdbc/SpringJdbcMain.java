package com.spring.core.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringJdbcMain {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("D:\\Eclipse_Workspaces\\Core07\\Core07\\src\\com\\spring\\core\\jdbc\\application_jdbc.xml");
		PersonService service=(PersonService)context.getBean("personService");
		Person person=new Person();
		person.setId(02);
		person.setFirstName("Ashok");
		person.setLastName("Jai");
		person.setFullname("Ashok Jai");
		person.setEmail("ashok@gmail.com");
		System.out.println(service.deletePerson(02));

	}

}
