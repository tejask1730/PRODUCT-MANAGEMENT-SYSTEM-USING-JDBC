package com.product.service;


import com.product.dao.CustomerDao;
import com.product.dto.Customer;

public class CustomerService {
	CustomerDao customerDao=new CustomerDao();
 
 public Customer saveAllData(Customer customer) {
	 return customerDao.saveAllData(customer);
	 
 }
 
 public boolean deleteData(int id) {
	 return customerDao.deleteData(id);
 }
 
 public int updateData(String name, int id) {
	 return customerDao.updateData(name, id);
	 
 }

 public void getAllDataById(int id) {
	  customerDao.getAllDataById(id);
 }
 public Customer getAllData(Customer customer) {
	 return customerDao.getAllData(customer);
 }
 
		 
}
