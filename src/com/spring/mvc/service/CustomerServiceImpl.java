package com.spring.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.database.CustomerDao;
import com.spring.mvc.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDao customerDao;
	@Autowired
	private AlertService alertService;
	@Override
	public void saveCustomer(Customer customer) {
		alertService.sendCustomerAlert(customer);
		customerDao.saveCustomer(customer);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		/*Customer customer = alertService.getCustomerAlert();
		if(customer!=null) {
			System.out.println(customer.getName());	
		}*/
		
		return customerDao.getAllCustomers();
	}

	@Override
	public Customer getCustomer(Long id) {
		// TODO Auto-generated method stub
		return customerDao.getCustomer(id);
	}

	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.deleteCustomer(customer);
	}

}
