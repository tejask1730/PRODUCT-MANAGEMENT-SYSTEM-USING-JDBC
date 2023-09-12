package com.product.service;

import com.product.dao.ProductDao;
import com.product.dto.Product;

public class ProductService {
	ProductDao productDao = new ProductDao();

	public Product saveProduct(Product product) {
		Product p = productDao.saveProduct(product);
		return p;
	}

	public boolean deleteProduct(int id) {
		return productDao.deleteProduct(id);
	}

	public int updateProduct(String name, double price, int id) {
		return productDao.updateProduct(name, price, id);

	}

	public void getALLProductById(int id) {
		productDao.getALLProductById(id);

	}
	public Product getAllData(Product product) {
		return  productDao.getAllData(product);
	
	}

}
