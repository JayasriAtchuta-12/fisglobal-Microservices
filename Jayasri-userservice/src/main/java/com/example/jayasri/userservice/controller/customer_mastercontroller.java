package com.example.jayasri.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.jayasri.userservice.model.customer_master;
import com.example.jayasri.userservice.model.loan_detailsdto;
import com.example.jayasri.userservice.service.customer_masterserviceimpl;

@RestController
@RequestMapping("/customers")
public class customer_mastercontroller {
	@Autowired
	  customer_masterserviceimpl service;
	  
	  @PostMapping("/registercustomer")
	  public customer_master setcustomerreg(@RequestBody customer_master customer) {
		return service.insertCustomer(customer);
	  }
	  @PostMapping("/applyforcustomerloan")
	  public loan_detailsdto applyforloanCustomer(@RequestBody loan_detailsdto loan) {
		  return service.insertLoan(loan);
	  }
		 @DeleteMapping("/delete/{cid}")
			public String deleteCustomer(@PathVariable("cid")String cid) {
				service.deleteCustomer(cid);
				return "Record deleted";
			}
		 @GetMapping("/all")
			public List<customer_master> showAll(){
				return service.getAllCustomers();
			}
}
