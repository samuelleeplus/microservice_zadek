# Overview 

This is the microservice architecture for the backend services for one of my mobile applications that I created (can be found here). 

It was previously made using a monolithic form, but switched architecture design to allow for scalability, loose coupling and future deployment.  

## User services 

This includes the user, owner and restaurant services. 


## Cloud Gateway 



## Service Registry 


## Hystrix


## Cloud Config Server

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






