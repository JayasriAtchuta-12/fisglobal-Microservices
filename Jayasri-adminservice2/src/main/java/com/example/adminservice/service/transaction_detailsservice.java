package com.example.adminservice.service;

import java.util.List;
import com.example.adminservice.model.transaction_details;

public interface transaction_detailsservice {
	public List<transaction_details> findByTransactionType(String transaction_type);
}
