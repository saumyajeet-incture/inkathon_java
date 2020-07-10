package com.incture.MasterBUPA.mapper;

import com.incture.MasterBUPA.dto.request.IdentificationDTO;
import com.incture.MasterBUPA.entity.Identification;

public class IdentificationMapper {

	public static Identification checkIdentification(IdentificationDTO identificationDTO, Integer bp_id) {

		Identification identity = new Identification();
		if (identificationDTO.getBirthPlace() != "" && identificationDTO.getCountry() != ""
				&& identificationDTO.getCountryOfOrigin() != "" && identificationDTO.getEmployer() != ""
				&& identificationDTO.getMaritalStatus() != "" && identificationDTO.getNationality() != ""
				&& identificationDTO.getOccupation() != "" && identificationDTO.getPersonnelNo() != ""
				&& identificationDTO.getUname() != "") {
			identity.setBpId(bp_id);
			identity.setBirthPlace(identificationDTO.getBirthPlace());
			identity.setCitizenship(identificationDTO.getCountry());
			identity.setCountryOfOrigin(identificationDTO.getCountryOfOrigin());
			identity.setEmployeer(identificationDTO.getEmployer());
			identity.setMaritalStatus(identificationDTO.getMaritalStatus());
			identity.setNationalityStatus(identificationDTO.getNationality());
			identity.setOccupation(identificationDTO.getOccupation());
			identity.setPersonnelNo(identificationDTO.getPersonnelNo());
			identity.setUserName(identificationDTO.getUname());
		}
		return identity;

	}

}
