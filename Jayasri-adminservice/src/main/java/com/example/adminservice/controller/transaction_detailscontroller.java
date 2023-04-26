package com.example.adminservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.model.transaction_details;
import com.example.adminservice.service.transaction_detailsserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/transactions")
public class transaction_detailscontroller {
	@Autowired
	transaction_detailsserviceimpl service;
	@GetMapping("findByTransaction/{title}")
	public List<transaction_details> findTitleData(@PathVariable("transaction_type") String transaction_type){
		return service.findByTransactionType(transaction_type);
	}
}
