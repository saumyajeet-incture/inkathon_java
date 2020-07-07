package com.incture.MasterBUPA.dao.bupa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.incture.MasterBUPA.entity.CommunicationDetail;

public interface CommunicationRepository extends JpaRepository<CommunicationDetail,Integer> {

}
