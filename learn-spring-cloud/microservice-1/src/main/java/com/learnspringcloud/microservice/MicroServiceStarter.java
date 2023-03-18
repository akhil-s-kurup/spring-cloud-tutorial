package com.learnspringcloud.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(value = "com.learnspringcloud.microservice.feignclients")
public class MicroServiceStarter 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(MicroServiceStarter.class);
    }
}
