/**
 * 
 */
package com.incture.MasterBUPA.service.implementation;

import java.util.List;

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
	
	private CommunicationDetail commDetail;
	
	public List<Object[]> checkIfExists = null;

	@Override
	public void save(CommunicationDetail commDetail) {
		// TODO Auto-generated method stub
		commRepository.save(commDetail);
		
	}

	@Override
	public List<CommunicationDetail> getCommunication() {
		// TODO Auto-generated method stub
		return commRepository.findAll();
	}

	@Override
	public CommunicationDetail getCommunicationById(int id) {
		// TODO Auto-generated method stub
		commDetail=new CommunicationDetail();
		checkIfExists=commRepository.findDetail(id);
		int status=0;
		if(checkIfExists.isEmpty()){
			status=1;
		}
		if(status==1){
			return null;
		}
		commDetail.setBpId(id);
		commDetail.setCommunicationId((Integer) checkIfExists.get(0)[0]);
		commDetail.setComments((String) checkIfExists.get(0)[2]);
		commDetail.setEmail((String) checkIfExists.get(0)[3]);
		commDetail.setExtAddress((String) checkIfExists.get(0)[4]);
		commDetail.setFax((String) checkIfExists.get(0)[5]);
		commDetail.setMobile((String) checkIfExists.get(0)[6]);
		commDetail.setStandCommMethod((String) checkIfExists.get(0)[7]);
		commDetail.setTelephone((String) checkIfExists.get(0)[8]);
		return commDetail;
	}

}
