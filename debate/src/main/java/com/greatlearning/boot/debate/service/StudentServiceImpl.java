package com.greatlearning.boot.debate.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.greatlearning.boot.debate.entities.Students;
import com.greatlearning.boot.debate.repo.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService  {
	
	@Autowired
	StudentRepository x;

	@Override
	public List<Students> findAll() {
		// TODO Auto-generated method stub
		List<Students> students = x.findAll();
		return students;
	}

	@Override
	public void save(Students theStudent) {
		// TODO Auto-generated method stub
		x.save(theStudent);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		x.deleteById(theId);
		
	}

	@Override
	public Students findById(int id) {
		// TODO Auto-generated method stub
		Students student = x.findById(id).get();
		return student;
	}

}
