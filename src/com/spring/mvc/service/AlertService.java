package com.spring.mvc.service;

import com.spring.mvc.model.Customer;

public interface AlertService {
	public void sendCustomerAlert(Customer customer);
	public Customer getCustomerAlert();

}
