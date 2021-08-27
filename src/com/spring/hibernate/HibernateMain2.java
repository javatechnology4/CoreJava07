package com.spring.hibernate;

import java.util.List;

import org.hibernate.FetchMode;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.SimpleExpression;

public class HibernateMain2 {

	@SuppressWarnings({ "deprecation", "unchecked" })
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
		/*Criterion eq = Expression.eq("username", "Ramesh");
		User user = (User)session.createCriteria(User.class).add(eq).uniqueResult();
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());*/
		
		/*List<Bid> bid=session.createCriteria(Bid.class)
		.add(Expression.between("amount", new String("10000"), new String("15000"))).list();
		bid.forEach(bi->{
			System.out.println(bi.getAmount());
			System.out.println(bi.getId());
		});*/
		/*List<Bid> bid=session.createCriteria(Bid.class)
				.addOrder(Order.asc("amount")).list();
				bid.forEach(bi->{
					System.out.println(bi.getAmount());
					System.out.println(bi.getId());
				});*/
		/*String query="from Item item left join fetch item.bids where item.description =:searchString";
		List<Item> join = session.createQuery(query).setString("searchString", "I phone Information").list();
		join.forEach(item->{
			System.out.println(item.getId());
			System.out.println(item.getDescription());
			item.getBids().forEach(bid->{
				System.out.println(bid.getAmount());
				System.out.println(bid.getId());
			});
			
		});*/
		List<Item> join =session.createCriteria(Item.class).setFetchMode("bids", FetchMode.EAGER)
		.add(Expression.eq("description", "I phone Information")).list();
		join.forEach(item->{
			System.out.println(item.getId());
			System.out.println(item.getDescription());
			item.getBids().forEach(bid->{
				System.out.println(bid.getAmount());
				System.out.println(bid.getId());
			});
			
		});
	}

}
