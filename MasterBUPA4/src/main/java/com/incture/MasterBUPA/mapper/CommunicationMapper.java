package com.incture.MasterBUPA.mapper;

import com.incture.MasterBUPA.dto.request.CommunicationDTO;
import com.incture.MasterBUPA.entity.CommunicationDetail;

public class CommunicationMapper {
	
	

	public static CommunicationDetail checkCommunication(CommunicationDTO communicationDTO, Integer bp_id) {
		CommunicationDetail communication = new CommunicationDetail();
		int fullEmpty;
		
		if (communicationDTO.getComments() == "" && communicationDTO.getEmail() == ""
				&& communicationDTO.getExtAddress() == "" && communicationDTO.getFax() == ""
				&& communicationDTO.getMobile() == "" && communicationDTO.getStandCommMethod() == ""
				&& communicationDTO.getTelephone() == ""){
			fullEmpty=1;
	
		}
		else{
			fullEmpty=0;
		}
		
		if (fullEmpty==0) {
			communication.setBpId(bp_id);
			communication.setComments(communicationDTO.getComments());
			communication.setEmail(communicationDTO.getEmail());
			communication.setExtAddress(communicationDTO.getExtAddress());
			communication.setFax(communicationDTO.getFax());
			communication.setMobile(communicationDTO.getMobile());
			communication.setStandCommMethod(communicationDTO.getStandCommMethod());
			communication.setTelephone(communicationDTO.getTelephone());
			fullEmpty=-1;
			return communication;
		}
		return null;
	}

}
