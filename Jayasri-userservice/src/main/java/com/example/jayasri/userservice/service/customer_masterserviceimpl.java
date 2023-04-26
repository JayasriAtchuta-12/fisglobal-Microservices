package com.example.jayasri.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.jayasri.userservice.dao.customer_masterdao;
import com.example.jayasri.userservice.model.customer_master;
import com.example.jayasri.userservice.model.loan_detailsdto;
import com.example.jayasri.userservice.model.loan_detailsproxy;
@Service
public class customer_masterserviceimpl implements customer_masterservice {
    @Autowired
    customer_masterdao dao;
    @Autowired
    loan_detailsproxy template;
	@Override
	public List<customer_master> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public customer_master insertCustomer(customer_master customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}

	@Override
	public void deleteCustomer(String bid) {
		// TODO Auto-generated method stub
		dao.deleteById(bid);
	}

	@Override
	public loan_detailsdto insertLoan(loan_detailsdto loan) {
		// TODO Auto-generated method stub
		return template.createLoan(loan);
	}

}
