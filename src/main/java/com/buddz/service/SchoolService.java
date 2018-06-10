package com.buddz.service;

import java.util.List;

import com.buddz.model.School;

public interface SchoolService {

	//Get all schools
	public List<School> getSchools();
	
	public School getById(long id);
	
	public void addSchool(School school);
	
	public void deleteSchool(long id);
	
	public void updateSchool(School school);
}
