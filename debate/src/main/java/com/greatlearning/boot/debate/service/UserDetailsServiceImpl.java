package com.greatlearning.boot.debate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.boot.debate.repo.UserRepository;
import com.greatlearning.boot.debate.entities.User;
import com.greatlearning.boot.debate.security.MyUserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired 
	private UserRepository y;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = y.getUserByUsername(username);
        
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new MyUserDetails(user);
	
	}

}
