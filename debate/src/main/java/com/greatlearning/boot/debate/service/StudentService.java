package com.greatlearning.boot.debate.service;

import java.util.List;

import com.greatlearning.boot.debate.entities.Students;

public interface StudentService {
	
    public List<Students> findAll();

	public void save(Students theStudent);

	public void deleteById(int theId);
	
	public Students findById(int id);


}
