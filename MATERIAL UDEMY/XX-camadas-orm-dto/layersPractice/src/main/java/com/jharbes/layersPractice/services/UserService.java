package com.jharbes.layersPractice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jharbes.layersPractice.dto.UserDto;
import com.jharbes.layersPractice.entities.User;
import com.jharbes.layersPractice.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional(readOnly = true)
	public UserDto findById(Long id) {
		User entity = userRepository.findById(id).get();
		UserDto userDto = new UserDto(entity);
		return userDto;
	}
}
