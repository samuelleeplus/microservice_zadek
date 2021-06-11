package com.samuelleeplus.hystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
@EnableEurekaClient
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
	}


	/* STEPS

	1. go to port 9192/hystrix -> this will lead to the dashboard

	2. Check if hystrix stream is working. Go to gateway port 9191/actuator/hystrix.stream

	3. If stream is working, give the following stream address to the dashboard
		e.g. http://localhost:9191/actuator/hystrix.stream

	4. Monitor stream



	 */


}
