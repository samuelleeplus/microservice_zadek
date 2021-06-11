package com.samuelleeplus.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication.class, args);
	}

	/*
	Purpose of the config server is to create a point where different microservices (given hundreds or thousands)
	can retrieve the necessary default zones/configurations -> so you don't have to edit configs for each
	service if there are any changes.

	This service gets the configurations from a github repository (with cloud-config-server dependency)


	 */


}
