package com.spring.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class RoundTable implements Table,BeanNameAware,BeanFactoryAware,BeanPostProcessor, DisposableBean{
	private String name;
	private Quest quest;
	//private OrderService orderService;

	public RoundTable(String name) {
		this.name = name;
		//injection = new DInjection();
	}

	public Object table() {
		//Order createOrder(request);
		//orderService.checkOut(order);
		return quest.embark();
	}
	public void setQuest(Quest quest) {
		this.quest=quest;
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("Bean Name: " +name);
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(beanFactory.getClass().getName());
		
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(bean.getClass().getName());
		System.out.println("Bean Name BeforeInitialization: " +beanName);
		return null;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(bean.getClass().getName());
		System.out.println("Bean Name AfterInitialization: " +beanName);
		return null;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy method");
		
	}

}
