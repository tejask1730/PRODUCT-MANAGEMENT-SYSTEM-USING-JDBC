package com.product.controller;

import com.product.dto.Customer;
import com.product.service.CustomerService;

public class CustomerGetAllController {
	public static void main(String[] args) {
		Customer customer = new Customer();
		CustomerService customerService =new CustomerService();
		customerService.getAllData(customer);
		
		

	}
}
