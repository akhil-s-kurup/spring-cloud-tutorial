package com.learnspringcloud.microservice.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnspringcloud.microservice.feignclients.PaymentFeignClient;
import com.learnspringcloud.microservice.staticdata.AppoinmentDetails;

@Service
public class AppoinmentService {
	
	@Autowired
	PaymentFeignClient paClient;
	
	public String getAppoinemnt()
	{
		return new AppoinmentDetails(new Random().nextInt(), paClient.getPaymentId()).toString();
	}

}
