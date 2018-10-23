package com.skcc.dtlabs.mail.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.skcc.dtlabs.mail.service.EmailService;
import com.skcc.dtlabs.mail.vo.Email;

@RestController
@RequestMapping("/v1")
public class EmailRestController {

	@Autowired
	private EmailService service;

	@RequestMapping(value = "/email", method = RequestMethod.POST)
	public String sendMail(@RequestBody Email email) {

		System.out.println("MainController : sendMail() : data = " + email.toString());

		try {
			service.sendEmail(email);
			return "success";
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "error";
	}

}
