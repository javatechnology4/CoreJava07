package com.spring.core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("application_annotation.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Performer per=(Performer)context.getBean("performer");
		try {
			per.perform();
		} catch (PerformanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
