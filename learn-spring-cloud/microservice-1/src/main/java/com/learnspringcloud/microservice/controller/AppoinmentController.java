package com.learnspringcloud.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspringcloud.microservice.service.AppoinmentService;

@RestController
public class AppoinmentController {

	@Autowired
	AppoinmentService appoinmentService;
	
	@GetMapping("/get-appoinment")
	public String getAppoinment()
	{
		return appoinmentService.getAppoinemnt();
	}
	
}


