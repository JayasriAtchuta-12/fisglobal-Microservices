package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.loan_details;
@Repository
public interface loan_detailsdao extends JpaRepository<loan_details,String>{

}
