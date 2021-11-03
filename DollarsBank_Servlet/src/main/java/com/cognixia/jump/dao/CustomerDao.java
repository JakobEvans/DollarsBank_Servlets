package com.cognixia.jump.dao;

import java.util.List;

import com.cognixia.jump.model.Customer;

public interface CustomerDao {
	
	public List<Customer> getAllCustomers();
	
	
	public boolean addCustomer(Customer book);
	
	


}

