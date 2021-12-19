package com.greatlearning.boot.debate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.boot.debate.entities.Students;

public interface StudentRepository extends JpaRepository <Students, Integer> {

}
