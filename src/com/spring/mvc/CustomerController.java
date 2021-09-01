package com.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.model.Customer;
import com.spring.mvc.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@RequestMapping("/")
	public ModelAndView home() {
		List<Customer> allCustomers = customerService.getAllCustomers();
		ModelAndView mav=new ModelAndView("home");
		mav.addObject("listOfCustomers",allCustomers);
		return mav;
	}

}
