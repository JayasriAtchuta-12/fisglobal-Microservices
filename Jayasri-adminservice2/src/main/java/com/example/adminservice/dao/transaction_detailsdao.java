package com.example.adminservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.adminservice.model.transaction_details;
import org.springframework.stereotype.Repository;

@Repository
public interface transaction_detailsdao extends JpaRepository<transaction_details,String>{
	//public List<transaction_details> findByTransactionType(String transaction_type);
}
