package com.example.jayasri.userservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jayasri.userservice.model.customer_master;
@Repository
public interface customer_masterdao extends JpaRepository<customer_master,String>{

}
