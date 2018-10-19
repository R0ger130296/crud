package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@Service
public class UserServicelmpl implements UserService {

	@Autowired
	protected UserRepository userRepository;

	@Override
	public User save(User user) {
	return this.userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		return this.userRepository.findAll();
	}
	
	@Override
	public Optional<User> findbyCedula(Long id) {
		return this.userRepository.findById(id);
	}

	@Override
	public void deleteUser(long id) {
		this.userRepository.deleteById(id);
	}
}
