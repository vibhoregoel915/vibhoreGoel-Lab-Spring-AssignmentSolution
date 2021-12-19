package com.greatlearning.boot.debate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.boot.debate.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {
	public User getUserByUsername(String username);
}
