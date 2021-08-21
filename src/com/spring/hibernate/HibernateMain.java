package com.spring.hibernate;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HibernateMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration()/*.configure("hibernate.cfg.xml")*/;
		//cfg.addResource("com/spring/hibernate/Message.hbm.xml");
		cfg.setNamingStrategy(new CENamingStrategy());
		cfg.addClass(Message.class);
		cfg.addClass(User.class);
		cfg.addClass(Address.class);
		cfg.addClass(BillingDetails.class);
		cfg.addClass(Bid.class);
		cfg.addClass(Item.class);
		cfg.addClass(Category.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Category category=(Category) session.get(Category.class, new Long(12));
		System.out.println(category!=null?category.getName():null);
		transaction.commit();
		session.close();
		/*Category category=new Category();
		category.setName("Electronics");
		session.save(category);*/
		/*Category category=(Category) session.get(Category.class, new Long(4));
		Category laptops=new Category();
		laptops.setName("Laptops");
		Category la=new Category();
		la.setName("Laptops Accessories");
		Category tablet=new Category();
		tablet.setName("Tablet PCs");
		laptops.addChildCategory(la);
		laptops.addChildCategory(tablet);
		category.addChildCategory(laptops);
		
		transaction.commit();
		session.close();*/
		
		/*User user=(User)session.get(User.class,new Long(1));
		user.setUsername("update the username");
		System.out.println(user.getUsername());
		session.delete(user);
		transaction.commit();
		session.close();
		System.out.println(user.getUsername());*/
		/*User user=new User();
		user.setUsername("Hazel");
		user.setPassword("Hazel");
		session.save(user);user.setUsername("Hazel");
		user.setPassword("Hazel");
		
		transaction.commit();
		session.close();
		
		Session session2 = sessionFactory.openSession();
		Transaction transaction2 = session2.beginTransaction();
		session2.lock(user,LockMode.NONE);
		user.setPassword("Lock");
		transaction2.commit();
		session2.close();*/
		
		//Object item1 = session.load(Item.class, new Long(3));
		//Object item2 = session.load(Item.class, new Long(3));
		
		/*Session session2 = sessionFactory.openSession();
		Transaction transaction2 = session2.beginTransaction();
		Object item2 = session2.load(Item.class, new Long(3));
		if(item1==item2)
			System.out.println("booth objects are same");*/
		/*Item item=new Item();
		item.setName("Mobile Phone");
		item.setDescription("I phone Information");*/
		//Set<Bid> bids=new HashSet<>();
		/*Bid bid1=new Bid();
		bid1.setAmount("12000");
		bid1.setItem(item);
		
		Bid bid2=new Bid();
		bid2.setAmount("14500");
		bid2.setItem(item);
		item.getBids().add(bid1);
		item.getBids().add(bid2);*/
		//item.setBids(bids);
		/*CreditCard cc=new CreditCard(); 
		cc.setOwner("BILLING_DETAILS");
		cc.setNumber("4568521");
		cc.setType("CC");
		cc.setExpMonth("June");
		cc.setExpYear("2021");
		cc.setCreatedDate(new Date());*/
		/*BankAccount ba=new BankAccount();
		ba.setBankName("SBI");
		ba.setBankNumber("2036587");
		ba.setCreatedDate(new Date());
		ba.setNumber("7412547");
		ba.setOwner("BANK_ACCOUNT");*/
		/*User user=new User();
		user.setUsername("HIbernate");
		user.setPassword("Hibernate");
		Address homeAddress=new Address();
		homeAddress.setStreet("Hi1");
		homeAddress.setCity("Hib");
		homeAddress.setZipcode("12201");
		Address billingAddress=new Address();
		billingAddress.setStreet("Hi1");
		billingAddress.setCity("Hib");
		billingAddress.setZipcode("12201");
		user.setHomeAddress(homeAddress);
		user.setBillingAddress(billingAddress);
		homeAddress.setUser(user);
		billingAddress.setUser(user);*/
		//session.save(item);
		//session.save(bid1);
		//session.save(bid2);
		/*Message message = (Message)session.load(Message.class, new Long(1));
		message.setMessage("Changed the text");
		Message nextMessage=new Message("Next Message");
		message.setNextMessage(nextMessage);*/
		/*List<Message> find = session.find("from Message as m order by m.message asc");
		System.out.println(find.size() +" Messages found");
		find.forEach(action->{
			System.out.print(action.getId());
			System.out.print(action.getMessage());});*/
		/*Message message = new Message("Welcome to Hibernate");
		session.save(message);*/
		//Serializable identifier = session.getIdentifier(message);
		
	}

}
