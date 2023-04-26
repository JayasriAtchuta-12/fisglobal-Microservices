package com.example.jayasri.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.example.jayasri.userservice.model")
public class AtchutaJayasriUserserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtchutaJayasriUserserviceApplication.class, args);
	}
}
