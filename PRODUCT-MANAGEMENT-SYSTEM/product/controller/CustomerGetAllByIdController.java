package com.product.controller;

import com.product.service.CustomerService;

public class CustomerGetAllByIdController {
	public static void main(String[] args) {
		CustomerService customerService =new CustomerService();
		customerService.getAllDataById(1);
	}

}
