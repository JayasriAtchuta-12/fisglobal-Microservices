package com.example.adminservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.dao.branch_masterdao;
import com.example.adminservice.model.branch_master;

@Service
public class branch_masterserviceimpl implements branch_masterservice{

	@Autowired
	branch_masterdao dao;
	@Override
	public List<branch_master> getAllBranches() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}
	@Override
	public branch_master insertBranch(branch_master branch) {
		// TODO Auto-generated method stub
		return dao.save(branch);
	}
	@Override
	public void deleteBranch(String bid) {
		// TODO Auto-generated method stub
		dao.deleteById(bid);
	}

}
