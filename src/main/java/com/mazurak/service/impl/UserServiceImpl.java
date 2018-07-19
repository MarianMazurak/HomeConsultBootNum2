package com.mazurak.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mazurak.entity.User;
import com.mazurak.entity.enums.UserStatus;
import com.mazurak.mail.Mail;
import com.mazurak.repository.UserRepository;
import com.mazurak.service.EmailService;
import com.mazurak.service.UserService;
import com.mazurak.service.utils.RandomToken;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EmailService emailService;

	@Override
	public void saveUser(User user) {

		String token = RandomToken.generateToken(50);

		user.setUserStatus(UserStatus.ACTIVATION_PENDING);
		user.setToken(token);
		userRepository.save(user);

		Mail mail = new Mail();
		mail.setTo(user.getEmail());
		mail.setSubject("You are succesfully registered");
		mail.setContent(
				"Please verify you " + "http://localhost:8080/user/verify?toked=" + token + "&id=" + user.getId());
	//	emailService.sendMessage(mail);
	}

	@Override
	public User findUserById(Integer id) {
		return userRepository.getOne(id);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void verifyAccount(String token, String id) {
		int userId = Integer.valueOf(id);
		User user = userRepository.getOne(userId);
		if (user.getToken().equals(token)) {
			user.setUserStatus(UserStatus.ACTIVE);
			user.setToken(null);

			userRepository.save(user);
		}
	}

	@Override
	public void update(User user) {
		userRepository.save(user);
	}
	
	
	
}
