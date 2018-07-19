package com.mazurak.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mazurak.mail.Mail;
import com.mazurak.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {
// This interface have method send
	@Autowired JavaMailSender javaMailSender;
	
	@Override
	public void sendMessage(Mail mail) {
		// this message have all field like class Mail
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(mail.getFrom());
		message.setTo(mail.getTo());
		message.setSubject(mail.getSubject());
		message.setText(mail.getContent());
	
		javaMailSender.send(message);
	}
}
