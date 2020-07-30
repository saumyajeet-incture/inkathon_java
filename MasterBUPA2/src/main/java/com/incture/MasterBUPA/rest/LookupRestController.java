package com.incture.MasterBUPA.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.MasterBUPA.entity.BusinessRole;
import com.incture.MasterBUPA.entity.Country;
import com.incture.MasterBUPA.entity.ReferenceDocument;
import com.incture.MasterBUPA.entity.SearchParameter;
import com.incture.MasterBUPA.entity.Language;
import com.incture.MasterBUPA.entity.MaritalStatus;
import com.incture.MasterBUPA.entity.Nationality;
import com.incture.MasterBUPA.entity.Occupation;
import com.incture.MasterBUPA.entity.StandCommMethod;
import com.incture.MasterBUPA.service.implementation.LookUpServiceImplementation;

@RestController
@RequestMapping("/api")
public class LookupRestController {
	
	@Autowired
	private LookUpServiceImplementation languageservice;
	
	@Autowired
	private LookUpServiceImplementation referenceservice;
	
	@Autowired
	private LookUpServiceImplementation maritalStatusservice;
	
	@Autowired
	private LookUpServiceImplementation countryservice;
	
	@Autowired
	private LookUpServiceImplementation occupationservice;
	
	@Autowired
	private LookUpServiceImplementation standCommMethodservice;
	
	@Autowired
	private LookUpServiceImplementation nationalityService;
	
	@Autowired
	private LookUpServiceImplementation businessService;
	
	@Autowired
	private LookUpServiceImplementation searchParamService;
	
	
	@GetMapping("/languages")
	public List<Language> findAllLanguages(){
		return languageservice.findAllLanguages();
	}
	
	@GetMapping("/reference")
	public List<ReferenceDocument> findReference(){
		return referenceservice.findReference();
	}
	
	@GetMapping("/countries")
	public List<Country> findAllCountries(){
		return countryservice.findAllCountries();
	}
	
	@GetMapping("/maritalstatus")
	public List<MaritalStatus> findMaritalStatus(){
		return maritalStatusservice.findMaritalStatus();
	}
	
	@GetMapping("/occupation")
	public List<Occupation> findAllOccupation(){
		return occupationservice.findAllOccupation();
	}
	
	@GetMapping("/standCommMethod")
	public List<StandCommMethod> findAllStandCommMethod(){
		return standCommMethodservice.findAllStandCommMethod();
	}
	
	@GetMapping("/nationality")
	public List<Nationality> findAllNationality(){
		return nationalityService.findNationality();
	}
	
	@GetMapping("/businessRoles")
	public List<BusinessRole> findAllRoles(){
		return businessService.findBusinessRole();
	}
	
	@GetMapping("/searchParameter")
	public List<SearchParameter> findAllSearchParam(){
		return searchParamService.findSearchParameter();
	}

}
