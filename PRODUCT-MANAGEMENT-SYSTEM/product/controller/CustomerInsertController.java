package com.product.controller;

import com.product.dto.Customer;
import com.product.service.CustomerService;

public class CustomerInsertController {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(5);
		customer.setName("xyz");
		customer.setEmail("xyz@mail.com");

		CustomerService customerService = new CustomerService();
		Customer c = customerService.saveAllData(customer);
		if (c != null) {
			System.out.println(c.getId() + "saved sucessfully");
		}

	}

}
