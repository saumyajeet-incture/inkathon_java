package com.incture.BusinessPartner.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.BusinessPartner.service.BusinessService;

@RestController
@RequestMapping("/api")
public class BasicController {
	
	@Autowired
	private BusinessService businessService;
	
	
	

}
