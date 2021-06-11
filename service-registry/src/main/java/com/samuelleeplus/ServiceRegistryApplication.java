package com.samuelleeplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}

	/*
	This service uses the eureka server & can access the spring eureka server
	by going to the designated port in application.yml file.

	From the port, you can see all other connected microservices/clients connected to eureka server

	 */


}
