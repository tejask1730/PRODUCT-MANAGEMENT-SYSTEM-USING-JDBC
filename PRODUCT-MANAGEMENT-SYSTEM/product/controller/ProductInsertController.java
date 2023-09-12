package com.product.controller;

import com.product.dto.Product;
import com.product.service.ProductService;

public class ProductInsertController {
	public static void main(String[] args) {
		Product product =new Product();
		product.setId(1);
		product.setName("IPHONE");
		product.setPrice(150000.00);
		product.setQuantity(2);
		
		ProductService productService = new ProductService();
		Product p= productService.saveProduct(product);
		if (p!=null) {
			System.out.println(p.getId()+"saved successfully");
		}
		
	}

}
