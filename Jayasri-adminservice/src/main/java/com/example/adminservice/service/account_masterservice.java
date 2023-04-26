package com.example.adminservice.service;

import com.example.adminservice.model.account_master;

public interface account_masterservice {
	public account_master insertaccount(account_master account);
	public void deleteAccount(String aid);
}
