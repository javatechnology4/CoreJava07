package com.spring.mvc.service;

import com.spring.mvc.model.Customer;

public interface AlertService {
	void sendSpittleAlert(Customer customer);
	public String getAlert(); 

}
