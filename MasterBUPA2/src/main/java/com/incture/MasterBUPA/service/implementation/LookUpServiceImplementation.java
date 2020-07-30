package com.incture.MasterBUPA.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.BusinessRoleRepository;
import com.incture.MasterBUPA.dao.CountryRepository;
import com.incture.MasterBUPA.dao.ReferenceRepository;
import com.incture.MasterBUPA.dao.SearchParameterRepository;
import com.incture.MasterBUPA.dao.LanguageRepository;
import com.incture.MasterBUPA.dao.MaritalStatusRepository;
import com.incture.MasterBUPA.dao.NationalityRepository;
import com.incture.MasterBUPA.dao.OccupationRepository;
import com.incture.MasterBUPA.dao.StandCommMethodRepository;
import com.incture.MasterBUPA.entity.BusinessRole;
import com.incture.MasterBUPA.entity.Country;
import com.incture.MasterBUPA.entity.ReferenceDocument;
import com.incture.MasterBUPA.entity.SearchParameter;
import com.incture.MasterBUPA.entity.Language;
import com.incture.MasterBUPA.entity.MaritalStatus;
import com.incture.MasterBUPA.entity.Nationality;
import com.incture.MasterBUPA.entity.Occupation;
import com.incture.MasterBUPA.entity.StandCommMethod;

/**
 * @author ASHU
 * @author Saumyajeet
 */
@Service
public class LookUpServiceImplementation {
	
	@Autowired
	private LanguageRepository languageRepository;
	
	@Autowired
	private SearchParameterRepository searchParamRepo;
	
	@Autowired
	private CountryRepository countryRepository;

	@Autowired
	private MaritalStatusRepository maritalStatusRepository;

	@Autowired
	private ReferenceRepository referenceRepository;

	@Autowired
	private OccupationRepository occupationRepository;

	@Autowired
	private StandCommMethodRepository standCommMethodRepository;
	
	@Autowired
	private NationalityRepository nationalityRepository;
	
	@Autowired
	private BusinessRoleRepository businessRepository;


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

	public List<ReferenceDocument> findReference() {
		//Give all the Details for Reference Documents
		return referenceRepository.findAll();
	}
	
	public List<Nationality> findNationality(){
		return nationalityRepository.findAll();
	}
	
	public List<BusinessRole> findBusinessRole(){
		return businessRepository.findAll();
	}
	
	public List<SearchParameter> findSearchParameter(){
		return searchParamRepo.findAll();
	}

}
