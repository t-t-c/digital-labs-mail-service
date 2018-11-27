package com.skcc.dtlabs.mail.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.sendgrid.Content;
import com.sendgrid.Email;
import com.sendgrid.Mail;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;

@Service
public class EmailService {
	
	private static final String MATIL_TO = "ttc@sk.com";
	private static final String API_KEY = "";

	public void sendEmail(com.skcc.dtlabs.mail.vo.Email email) throws IOException {
		Email from = new Email(email.getEmail());
		Email to = new Email(MATIL_TO);
		Content content = new Content("text/plain", "문의 종류: " + email.getType() + "\n" + "이름: " + email.getName() + "\n" + email.getMessage());
		Mail mail = new Mail(from, email.getSubject(), to, content);

		SendGrid sg = new SendGrid(API_KEY);
		Request request = new Request();
		try {
			request.setMethod(Method.POST);
			request.setEndpoint("mail/send");
			request.setBody(mail.build());
			Response response = sg.api(request);
			System.out.println(response.getStatusCode());
			System.out.println(response.getBody());
			System.out.println(response.getHeaders());
		} catch (IOException ex) {
			throw ex;
		}
	}

}
