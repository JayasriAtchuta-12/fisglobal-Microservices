package com.example.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.adminservice.model.branch_master;
import com.example.adminservice.model.loan_details;
import com.example.adminservice.service.loan_detailsserviceimpl;

@RestController
@RequestMapping("/loans")
public class loan_detailscontroller {
	@Autowired
	loan_detailsserviceimpl service;
	@GetMapping("/allLoans")
	public List<loan_details> showAllLoans(){
		return service.getAllLoans();
	}
	@PostMapping("/applyLoan")
	public loan_details createLoan(@RequestBody loan_details loan) {
		return service.insertLoan(loan);
	}
}
