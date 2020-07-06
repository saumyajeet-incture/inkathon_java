package com.incture.MasterBUPA.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.entity.Language;

@Service
public interface LanguageService {
	
	public List<Language> findall();

}
