package com.product.controller;

import com.product.service.ProductService;

public class ProductUpdateController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		int b=productService.updateProduct("MOTO-G", 100000.00,4);
		System.out.println(b + "Updated sucessfully");
	}

}
