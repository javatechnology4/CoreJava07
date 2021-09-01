package com.spring.mvc.database;

import java.util.List;

import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.mvc.model.Customer;
@Repository
public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(customer);
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		Transaction transaction = hibernateTemplate.getSessionFactory().getCurrentSession().beginTransaction();
		List<Customer>listOfCustomers= (List<Customer>) hibernateTemplate.getSessionFactory().getCurrentSession().createQuery("from Customer").list();
		transaction.commit();
		return listOfCustomers;
	}

	@Override
	public Customer getCustomer(Long id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Customer.class, id);
	}

	@Override
	public void deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		//hibernateTemplate.delete(entity);
	}

}
