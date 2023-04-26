package com.example.jayasri.userservice.model;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient("ADMIN-SERVICE/loans")
public interface loan_detailsproxy {
	@PostMapping("/applyLoan")
	public loan_detailsdto createLoan(@RequestBody loan_detailsdto loan);
}
