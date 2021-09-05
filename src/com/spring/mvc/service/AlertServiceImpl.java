package com.spring.mvc.service;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.spring.mvc.model.Customer;
@Service
public class AlertServiceImpl implements AlertService{
	@Autowired
	private JmsTemplate jmsTemplate;

	@Override
	public void sendSpittleAlert(Customer customer) {
		jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(customer.getName());
			}
		});
		
	}

	@Override
	public String getAlert() {
		
			Message receive = jmsTemplate.receive();
			try {
				return receive.getJMSMessageID();
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return null;
	}

}
