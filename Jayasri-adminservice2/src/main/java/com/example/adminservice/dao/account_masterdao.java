package com.example.adminservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.account_master;

@Repository
public interface account_masterdao extends JpaRepository<account_master,String>{

}
