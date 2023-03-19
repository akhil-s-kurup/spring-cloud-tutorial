package com.learnspringcloud.microservice.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "api-gateway")
public interface PaymentFeignClient {

	@GetMapping("/micro-service2/get-payment-id")
	public int getPaymentId();
	
}
