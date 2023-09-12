package com.product.controller;

import com.product.service.CustomerService;

public class CustomerDeleteController {
public static void main(String[] args) {
	CustomerService customerService = new CustomerService();
	boolean c=customerService.deleteData(6);
    System.out.println(c);
			
}
}
