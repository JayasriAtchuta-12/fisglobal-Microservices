package com.example.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.dao.loan_detailsdao;
import com.example.adminservice.model.loan_details;

@Service
public class loan_detailsserviceimpl implements loan_detailsservice{
     
	@Autowired
	loan_detailsdao dao;
	@Override
	public List<loan_details> getAllLoans() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public loan_details insertLoan(loan_details loan) {
		// TODO Auto-generated method stub
		return dao.save(loan);
	}
	

}
