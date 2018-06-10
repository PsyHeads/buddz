package com.buddz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.buddz.model.School;
import com.buddz.service.SchoolService;

@RestController
public class SchoolController {

	@Autowired
	SchoolService schoolService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/schools")
	public List<School> getSchools() {
		List<School> schools = schoolService.getSchools(); 
		return schools;
	}
}
