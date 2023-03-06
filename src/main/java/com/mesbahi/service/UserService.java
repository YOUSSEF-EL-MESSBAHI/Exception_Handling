package com.mesbahi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mesbahi.dto.UserRequest;
import com.mesbahi.entity.User;
import com.mesbahi.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public User saveUser(UserRequest userRequest) {
		User user =User.build(0, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
		User saveUser = (User) userRepo.save(user);
		return saveUser;
	}
	
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	public User getUser(int id) {
		return userRepo.findByUserId(id);
	}
}
