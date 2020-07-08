/**
 * 
 */
package com.incture.MasterBUPA.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.CommunicationRepository;
import com.incture.MasterBUPA.entity.CommunicationDetail;
import com.incture.MasterBUPA.service.abstraction.CommunicationService;

/**
 * @author ASHU
 * @author SAUMYAJEET
 *
 */
@Service
public class CommunicationServiceImplementation implements CommunicationService {
	
	@Autowired
	private CommunicationRepository commRepository;

	@Override
	public void save(CommunicationDetail commDetail) {
		// TODO Auto-generated method stub
		commRepository.save(commDetail);
		
	}

}
