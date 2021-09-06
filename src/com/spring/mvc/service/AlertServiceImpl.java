package com.spring.mvc.service;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.spring.mvc.model.Customer;
@Service
public class AlertServiceImpl implements AlertService{
	@Autowired
	private JmsTemplate jmsTempalte;
	/*public void getConnection() {
ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");
try {
	Connection createConnection = cf.createConnection();
	Session createSession = createConnection.createSession(false, Session.AUTO_ACKNOWLEDGE);
	Destination destination=new ActiveMQQueue("customer.queue");
	MessageProducer createProducer = createSession.createProducer(destination);
	TextMessage textMessage = createSession.createTextMessage();
	textMessage.setText("Customer Name");
	createProducer.send(textMessage);
} catch (JMSException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}*/

	@Override
	public void sendCustomerAlert(Customer customer) {
		jmsTempalte.send("customer.queue", new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				// TODO Auto-generated method stub
				return session.createObjectMessage(customer);
			}
		});
		
	}

	@Override
	public Customer getCustomerAlert() {
		ObjectMessage receive = (ObjectMessage)jmsTempalte.receive();
		
		try {
			return (Customer) receive.getObject();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
