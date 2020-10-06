package com.rajuit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajuit.service.MailService;

@RestController
public class MailController {
	@Autowired
	private MailService mailServce;

	@GetMapping("/send")
	public String sendMail() {

		String sub = "Test";
		String body = "Hi,Hello ";
		String to = "razkumar4528@gmail.com";
		boolean isSent = mailServce.sendMail(sub, body, to);

		if (isSent)
			return "Mail sent Successfully!!";
		else
			return "Mail sent failed!!";

	}
}
