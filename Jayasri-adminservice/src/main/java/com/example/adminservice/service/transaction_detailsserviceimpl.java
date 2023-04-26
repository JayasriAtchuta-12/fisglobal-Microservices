package com.example.adminservice.service;

import java.util.List;

import com.example.adminservice.dao.transaction_detailsdao;
import com.example.adminservice.model.transaction_details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class transaction_detailsserviceimpl implements transaction_detailsservice{
	@Autowired
	transaction_detailsdao dao;
	@Override
	public List<transaction_details> findByTransactionType(String transaction_type) {
		// TODO Auto-generated method stub
		//return dao.findByTransactionType(transaction_type);
		return null;
	}

}
