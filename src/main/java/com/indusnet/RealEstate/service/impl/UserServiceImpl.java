package com.indusnet.RealEstate.service.impl;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indusnet.RealEstate.model.User;
import com.indusnet.RealEstate.repository.UserRepository;
import com.indusnet.RealEstate.service.UserService;

import lombok.Builder;
@Builder
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User createUser(User user) {
        
		Long currentTimeInMilli = Instant.now().toEpochMilli();
		User saveModel = User.builder()
				.emailId(user.getEmailId())
				.firstName(user.getfirstName())
			
				.password(user .getPassword())
				
				.build();
        return userRepository.save(user);
    }
}
