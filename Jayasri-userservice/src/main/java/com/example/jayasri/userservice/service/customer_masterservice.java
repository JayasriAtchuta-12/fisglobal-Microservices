package com.example.jayasri.userservice.service;

import java.util.List;
import com.example.jayasri.userservice.model.customer_master;
import com.example.jayasri.userservice.model.loan_detailsdto;

public interface customer_masterservice {
	public List<customer_master> getAllCustomers();
	public customer_master insertCustomer(customer_master customer);
	public void deleteCustomer(String bid);
	public loan_detailsdto insertLoan(loan_detailsdto loan);
}
