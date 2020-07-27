/**
 * 
 */
package com.incture.MasterBUPA.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.MasterBUPA.dao.bupa.IdentificationRepository;
import com.incture.MasterBUPA.entity.Identification;
import com.incture.MasterBUPA.service.abstraction.IdentificationService;

/**
 * @author ASHU
 * @author SAUMYAJEET
 *
 */
@Service
public class IdentificationServiceImplementation implements IdentificationService {

	@Autowired
	private IdentificationRepository identificationRepository;

	private Identification identification;

	public List<Object[]> checkIfExists = null;

	@Override
	public void save(Identification identification) {
		// TODO Auto-generated method stub
		identificationRepository.save(identification);

	}

	@Override
	public List<Identification> findIdentification() {
		// TODO Auto-generated method stub
		return identificationRepository.findAll();
	}

	@Override
	public Identification findIdentificationById(int id) {
		// TODO Auto-generated method stub
		checkIfExists = identificationRepository.findDetail(id);

		if (checkIfExists.isEmpty()) {
			return null;
		}

		identification = new Identification();
		identification.setBpId(id);
		identification.setBirthPlace((String) checkIfExists.get(0)[1]);
		identification.setCitizenship((String) checkIfExists.get(0)[3]);
		identification.setCountryOfOrigin((String) checkIfExists.get(0)[4]);
		identification.setEmployeer((String) checkIfExists.get(0)[5]);
		identification.setMaritalStatus((String) checkIfExists.get(0)[6]);
		identification.setNationalityStatus((String) checkIfExists.get(0)[7]);
		identification.setOccupation((String) checkIfExists.get(0)[8]);
		identification.setPersonnelNo((String) checkIfExists.get(0)[9]);
		identification.setUserName((String) checkIfExists.get(0)[10]);
		identification.setIdentificationId((Integer) checkIfExists.get(0)[0]);
		return identification;
	}

}
