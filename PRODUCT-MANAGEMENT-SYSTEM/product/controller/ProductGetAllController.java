package com.product.controller;

import com.product.dto.Product;
import com.product.service.ProductService;

public class ProductGetAllController {
	public static void main(String[] args) {
		Product product = new Product();
		ProductService productService = new ProductService();
		productService.getAllData(product);
		
		
		
		
	}
	


	

}
