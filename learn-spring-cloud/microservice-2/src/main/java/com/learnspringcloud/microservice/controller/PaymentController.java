package com.learnspringcloud.microservice.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@GetMapping("/get-payment-id")
	public int getPaymentId()
	{
		return new Random().nextInt();
	}
	
}
