package com.rajuit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	@Autowired
	private JavaMailSender javaMailSender;

	public boolean sendMail(String subject, String body, String to) {
		boolean isSent = false;
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setSubject(subject);
			message.setText(body);
			message.setTo(to);
			javaMailSender.send(message);
			isSent= true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSent;
	}

}
