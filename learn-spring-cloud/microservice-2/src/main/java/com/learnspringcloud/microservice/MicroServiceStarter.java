package com.learnspringcloud.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages ={"com.learnspringcloud.microservice"})
@EnableEurekaClient
public class MicroServiceStarter 
{
    public static void main( String[] args )
    {
        SpringApplication.run(MicroServiceStarter.class);
    }
}
