package com.demo.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.microservice.limitsservice.bean.Limits;
import com.demo.microservice.limitsservice.configuration.Configurationclass;

@RestController
public class LimitsController {
	
	@Autowired
	private Configurationclass configuration;
	
	@GetMapping("/limits")
	public Limits retrievelimits() {
		return new Limits(1,1000);
	}

	@GetMapping("/limits-applicationfile")
	public Limits retrievelimitsfromApplicationProp() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}
