package com.incture.MasterBUPA.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.MasterBUPA.dto.request.UpdateDTO;
import com.incture.MasterBUPA.service.abstraction.UpdateService;

@RestController
@RequestMapping("/update")
public class UpdateController {

	@Autowired
	private UpdateService updateService;
	
	@PostMapping("/check")
	public void Check(@RequestBody UpdateDTO updateDTO){
		updateService.update(updateDTO);
	}
	
}
