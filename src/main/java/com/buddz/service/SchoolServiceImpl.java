package com.buddz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buddz.model.School;
import com.buddz.repository.SchoolRepository;

@Service
public class SchoolServiceImpl implements SchoolService {

	@Autowired
	private SchoolRepository schoolRepository;
	 
	@Override
	public List<School> getSchools() {
		List<School> schools = new ArrayList<School>();	
		Iterable<School> schoolIter = schoolRepository.findAll();
		for (School school : schoolIter)
			schools.add(school);
		return schools;
	}

	@Override
	public School getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addSchool(School school) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSchool(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSchool(School school) {
		// TODO Auto-generated method stub
		
	}
}
