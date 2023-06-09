package com.example.adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AtchutaJayasriAdminserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AtchutaJayasriAdminserviceApplication.class, args);
	}

}
