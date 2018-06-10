package com.buddz.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.buddz.model.School;

@Repository
public interface SchoolRepository extends CrudRepository<School, Long> {
    List<School> findById(long schoolId);
}