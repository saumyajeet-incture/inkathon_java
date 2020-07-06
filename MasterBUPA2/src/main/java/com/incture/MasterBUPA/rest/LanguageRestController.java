package com.incture.MasterBUPA.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.MasterBUPA.entity.Language;
import com.incture.MasterBUPA.service.LanguageService;

@RestController
@RequestMapping("/api")
public class LanguageRestController {
	
	@Autowired
	private LanguageService languageservice;
	
	@GetMapping("/languages")
	public List<Language> findAll(){
		return languageservice.findall();
	}

}
