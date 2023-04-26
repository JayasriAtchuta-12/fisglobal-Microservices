package com.example.gateway;

import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
@Configuration
public class GatewayConfiguration {

	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
			.route(p->p.path("/loans/**").uri("lb://ADMIN-SERVICE/loans"))
			.route(p->p.path("/branches/**").uri("lb://ADMIN-SERVICE/branches"))
			.route(p->p.path("/accounts/**").uri("lb://ADMIN-SERVICE/branches"))
			.route(p->p.path("/customers/**").uri("lb://USER-SERVICE/customers"))
			.build();
		
	}
}
