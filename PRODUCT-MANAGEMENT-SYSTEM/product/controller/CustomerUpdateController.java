package com.product.controller;

import com.product.service.CustomerService;

public class CustomerUpdateController {
public static void main(String[] args) {
	CustomerService customerService= new CustomerService();
	int a=customerService.updateData("Mayur", 5);
	System.out.println(a);
}
	
}
