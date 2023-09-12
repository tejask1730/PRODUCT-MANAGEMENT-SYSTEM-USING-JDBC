package com.product.controller;


import com.product.service.ProductService;

public class ProductDeleteController {
	public static void main(String[] args) {
	
		ProductService productService = new ProductService();
		boolean res=productService.deleteProduct(5);
		System.out.println(res);
		
	}

}
