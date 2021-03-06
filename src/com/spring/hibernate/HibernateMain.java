package com.spring.hibernate;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.LockMode;
import org.hibernate.Query;
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
		Query createQuery = session.createQuery("from Category ca");
		List<Category> categoryList = createQuery.list();
		categoryList.stream().forEach(category->{System.out.println(category.getName());});
		
		/*Query createQuery = session.createQuery("from Category");
		List<Category> categoryList = createQuery.list();
		categoryList.stream().forEach(category->{System.out.println(category.getName());});
		//List<Category> categoryList =(List<Category>)session.createSQLQuery("select ce.* from hb.ce_category ce").addEntity("ce",Category.class).list();
		List<Category> categoryList =(List<Category>)session.createQuery("select {ce.*} from hb.ce_category ce").setEntity("ce", Category.class).list();
		categoryList.stream().forEach(category->{System.out.println(category.getName());});*/
		/*Query createQuery = session.createQuery("from Category");
		createQuery.setFirstResult(3);
		createQuery.setMaxResults(10);
		List<Category> categoryList = createQuery.list();
		categoryList.stream().forEach(category->{System.out.println(category.getName());});*/
		
		/*Bid bid = (Bid)session.createQuery(" from Bid b order by b.amount desc").setMaxResults(1).uniqueResult();
		System.out.println(bid.getAmount());
		System.out.println(bid.getId());
		System.out.println(bid.getItem().getId());*/
		
		/*String hql="from Item item where item.description like :searchString";
		List<Item> list = session.createQuery(hql).setString("searchString", "Lenovo Laptop Information").list();
		list.stream().forEach(item->{
			System.out.println(item.getDescription());
			System.out.println(item.getName());});*/
		/*String queryString="from Item item where item.description like ? and item.name =?";
		List<Item> list = session.createQuery(queryString).setString(0, "Lenovo Laptop Information").setString(1, "Laptop").list();
		list.stream().forEach(item->{
			System.out.println(item.getDescription());
			System.out.println(item.getName());});*/
		/*Address address = (Address)session.get(Address.class, new Long(1));
		String query="from User user where user.address=:address and user.username=:username";
		@SuppressWarnings("unchecked")
		List<User> list = session.createQuery(query).setParameter("address", address,Hibernate.entity(Address.class))
		.setParameter("username", address.getUser().getUsername(),Hibernate.STRING).list();
		list.forEach(user->{
			System.out.println(user.getId());
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
		});*/
		
		/*List<Item> list =session.getNamedQuery("findItemByDescription").setString("searchString", "Lenovo Laptop Information").list();
		list.stream().forEach(item->{
			System.out.println(item.getDescription());
			System.out.println(item.getName());});*/
		
		/*User user=new User();
		user.setUsername("Ramesh");
		user.setPassword("Kumar");
		
		Address address=new Address();
		address.setStreet("Hi-tech city");
		address.setCity("Hyderabad");
		address.setZipcode("500078");
		address.setUser(user);
		user.setAddress(address);
		session.save(user);
		transaction.commit();
		session.close();*/
		/*Item item1=new Item();
		item1.setName("Laptop");
		item1.setDescription("Lenovo Laptop Information");
		
		Item item2=new Item();
		item2.setName("Desktop");
		item2.setDescription("Dell Desktop Information");
		
		Category ca1=new Category();
		ca1.setName("Computer");
		
		Category ca2=new Category();
		ca2.setName("Mobile Phones");
		ca2.getItems().add(item1);
		ca2.getItems().add(item2);
		
		ca1.getItems().add(item1);
		ca1.getItems().add(item2);
		
		item1.getCategories().add(ca1);
		item1.getCategories().add(ca2);
		
		item2.getCategories().add(ca1);
		item2.getCategories().add(ca2);
		session.save(ca1);
		session.save(ca2);
		
		transaction.commit();
		session.close();*/
		/*Transaction transaction = null;
		
		try {
			transaction = session.beginTransaction();
			submit(session);
			session.flush();
			transaction.commit();
		}catch(Exception ex) {
			if(transaction!=null) {
				transaction.rollback();
				System.out.println("line number 41");
			}
		}finally {
			session.close();
		}*/
		
		
		
		
		
		
		/*Category category=(Category) session.get(Category.class, new Long(12));
		System.out.println(category!=null?category.getName():null);
		transaction.commit();
		session.close();*/
		/*Category category=new Category();
		category.setName("Electronics");
		session.save(category);
		transaction.commit();
		session.close();*/
		/*Category category=(Category) session.get(Category.class, new Long(6));
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
		item.setDescription("I phone Information");
		//Set<Bid> bids=new HashSet<>();
		Bid bid1=new Bid();
		bid1.setAmount("12000");
		bid1.setItem(item);
		
		Bid bid2=new Bid();
		bid2.setAmount("14500");
		bid2.setItem(item);
		item.getBids().add(bid1);
		item.getBids().add(bid2);
		session.save(item);
		transaction.commit();
		session.close();*/
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

	private static void submit(Session session) {
		@SuppressWarnings("deprecation")
		Category category=(Category) session.load(Category.class, new Long(12),LockMode.UPGRADE);
		System.out.println(category!=null?category.getName():null);
		
	}

}
