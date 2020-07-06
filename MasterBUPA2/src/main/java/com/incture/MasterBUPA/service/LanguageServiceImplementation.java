package com.incture.MasterBUPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.LanguageRepository;
import com.incture.MasterBUPA.entity.Language;

@Service
public class LanguageServiceImplementation implements LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;

	@Override
	public List<Language> findall() {
		// TODO Auto-generated method stub
		return languageRepository.findAll();
	}

}
