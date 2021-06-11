package com.samuelleeplus.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CustomerManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementServiceApplication.class, args);
	}

	// method must not be private
	@Bean
	@LoadBalanced	// if multiple services connected to service registry, it will balance the load
	public RestTemplate restTemplate(){

		return new RestTemplate();

	}


}
