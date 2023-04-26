package com.example.adminservice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminservice.model.branch_master;

@Repository
public interface branch_masterdao extends JpaRepository<branch_master,String>{
	
}
