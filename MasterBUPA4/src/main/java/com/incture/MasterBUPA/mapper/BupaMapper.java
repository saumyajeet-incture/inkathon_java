package com.incture.MasterBUPA.mapper;

import com.incture.MasterBUPA.dto.request.BupaDTO;
import com.incture.MasterBUPA.entity.BusinessPartner;

//@Validated
public class BupaMapper {
	
	

	public static BusinessPartner checkBP(/* @Valid */ BupaDTO bupaDto) {

		// if(error.hasErrors()){
		// throw new Exception("please provide all the required business partner
		// details.");
		// }

		BusinessPartner businessPartner = new BusinessPartner();
		if (bupaDto.getFname() != "" && bupaDto.getLname() != "" && bupaDto.getsLanguage() != ""
				&& bupaDto.getsRole() != "" && bupaDto.getsTerm1() != "" && bupaDto.getsTerm2() != "") {
			businessPartner.setBpRole(bupaDto.getsRole());
//			businessPartner.setRoleId(UUID.randomUUID());
			
			
			businessPartner.setFirstName(bupaDto.getFname());
			businessPartner.setLangKey(bupaDto.getsLanguage());
			businessPartner.setLastName(bupaDto.getLname());
			businessPartner.setSearchTerm1(bupaDto.getsTerm1());
			businessPartner.setSearchTerm2(bupaDto.getsTerm2());
			return businessPartner;
		}
		return null;
	}
}
