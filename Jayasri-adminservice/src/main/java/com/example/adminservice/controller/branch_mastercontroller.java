package com.example.adminservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.adminservice.model.branch_master;
import com.example.adminservice.service.branch_masterserviceimpl;


@RestController
@RequestMapping("/branches")
public class branch_mastercontroller {
	@Autowired
	branch_masterserviceimpl service;
	 @GetMapping("/all")
		public List<branch_master> showAll(){
			return service.getAllBranches();
		}
		
		@PostMapping("/added")
		public branch_master createBranch(@RequestBody branch_master branch) {
			return service.insertBranch(branch);
		}
		 @DeleteMapping("/delete/{bid}")
			public String deleteBranch(@PathVariable("bid")String bid) {
				service.deleteBranch(bid);
				return "Record deleted";
			}
}
