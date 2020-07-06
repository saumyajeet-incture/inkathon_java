package com.incture.MasterBUPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.CountryRepository;
import com.incture.MasterBUPA.dao.GenderRepository;
import com.incture.MasterBUPA.dao.LanguageRepository;
import com.incture.MasterBUPA.dao.MaritalStatusRepository;
import com.incture.MasterBUPA.dao.OccupationRepository;
import com.incture.MasterBUPA.dao.StandCommMethodRepository;
import com.incture.MasterBUPA.entity.Country;
import com.incture.MasterBUPA.entity.Gender;
import com.incture.MasterBUPA.entity.Language;
import com.incture.MasterBUPA.entity.MaritalStatus;
import com.incture.MasterBUPA.entity.Occupation;
import com.incture.MasterBUPA.entity.StandCommMethod;

/**
 * @author ASHU
 * @author Soumyajeet
 */
@Service
public class LookUpServiceImplementation {
	
	@Autowired
	private LanguageRepository languageRepository;
	
	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private MaritalStatusRepository maritalStatusRepository;

	@Autowired
	private GenderRepository genderRepository;

	@Autowired
	private OccupationRepository occupationRepository;

	@Autowired
	private StandCommMethodRepository standCommMethodRepository;


	public List<Language> findAllLanguages() {
		//Give all the Details of Languages
		return languageRepository.findAll();
	}

	public List<Occupation> findAllOccupation() {
		//Give all the Details of Occupation
		return occupationRepository.findAll();
	}

	public List<StandCommMethod> findAllStandCommMethod() {
		//Give all the Details of Standard Communication Methods
		return standCommMethodRepository.findAll();
	}

	public List<MaritalStatus> findMaritalStatus() {
		//Give all the Details of Marital Status
		return maritalStatusRepository.findAll();
		
	}

	public List<Country> findAllCountries() {
		//Give all the Details for Countries
		return countryRepository.findAll();
	}

	public List<Gender> findGender() {
		//Give all the Details for Gender
		return genderRepository.findAll();
	}

}
