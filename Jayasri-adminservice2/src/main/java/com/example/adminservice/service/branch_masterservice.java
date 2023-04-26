package com.example.adminservice.service;

import java.util.List;
import com.example.adminservice.model.branch_master;

public interface branch_masterservice {
	public List<branch_master> getAllBranches();
	public branch_master insertBranch(branch_master branch);
	public void deleteBranch(String bid);
}
