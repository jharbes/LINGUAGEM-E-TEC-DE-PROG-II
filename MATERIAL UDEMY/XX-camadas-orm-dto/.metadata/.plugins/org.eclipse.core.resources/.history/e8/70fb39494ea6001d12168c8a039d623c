package com.jharbes.layersPractice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jharbes.layersPractice.dto.UserDto;
import com.jharbes.layersPractice.entities.User;
import com.jharbes.layersPractice.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDto findById(Long id) {
		User entity = userRepository.findById(id).get();
		UserDto userDto = new UserDto(entity);
		return userDto;
	}
}
