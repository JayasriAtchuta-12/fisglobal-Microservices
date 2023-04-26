package com.example.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adminservice.dao.account_masterdao;
import com.example.adminservice.model.account_master;

@Service
public class account_masterserviceimpl implements account_masterservice{
	@Autowired
	 account_masterdao dao;

	@Override
	public account_master insertaccount(account_master account) {
		// TODO Auto-generated method stub
		return dao.save(account);
	}

	@Override
	public void deleteAccount(String aid) {
		// TODO Auto-generated method stub
		dao.deleteById(aid);
	}

}
