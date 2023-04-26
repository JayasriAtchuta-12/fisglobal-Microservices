package com.example.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.adminservice.model.account_master;
import com.example.adminservice.service.account_masterserviceimpl;

@RestController
@RequestMapping("/accounts")
public class account_mastercontroller {

	@Autowired
	account_masterserviceimpl service;
	
	@PostMapping("/added")
	public account_master createAccount(@RequestBody account_master account) {
		return service.insertaccount(account);
	}
	 @DeleteMapping("/delete/{aid}")
		public String deleteAccount(@PathVariable("aid")String aid) {
			service.deleteAccount(aid);
			return "Record deleted";
		}
}
