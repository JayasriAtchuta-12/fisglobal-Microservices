package com.example.adminservice.service;

import java.util.List;
import com.example.adminservice.model.loan_details;

public interface loan_detailsservice {
	public List<loan_details> getAllLoans();
	public loan_details insertLoan(loan_details loan);
}
