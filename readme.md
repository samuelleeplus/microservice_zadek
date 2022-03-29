# Overview 

This is the microservice architecture for the backend services for one of my mobile applications that I created (can be found [here](https://github.com/samuelleeplus/androidApplication)). 

It was previously made using a monolithic form, but switched architecture design to allow for scalability, loose coupling and future deployment.  

## User services 

This repository only contains a sample version of only the Customer Service. 

## Cloud Gateway 

This API gateway is a layer between any endpoint (e.g. users or any users of the microservices) and the different services. Depending on the URL pattern, they will be re-directed/routes to the needed service. 

The patterns can be edited in application.yml file. 

## Service Registry 

This service is a registry that contains all the port, url etc... of the different microservices, using Eureka server. All the microservices that connect to this registry will be the "client."

## Hystrix

This service is a dashboard that allows you to monitor all of your requests going to the services (to check for failures in API calls).  

## Cloud Config Server

For scalability (given that you have countless microservices), you need an external Cloud Config Server where you can get all the configurations for the different/many microservices. This Cloud Config Server can be found [here](https://github.com/samuelleeplus/microservice-config-server).

## Logging - Sleuth / Zipkin Server

[Zipkin](https://zipkin.io/) allows you to trace logs across services based on ID, service or operation name, tags and more. You can download the jar file in the website and run the following command on the command prompt : 



```bash
java -jar zipkin-server.jar
```

This will run the zipkin server on a port ( for localhost, most probably port 9411). 

For the microservices that you need tracing, make sure to add the Zipkin Client & Sleuth dependencies. 


```
 <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-sleuth-zipkin</artifactId>
    </dependency>
 <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-sleuth</artifactId>
 </dependency>
```






