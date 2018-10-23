package com.skcc.dtlabs.mail.vo;


public class Email {

	private String type;
	private String name;
	private String email;
	private String subject;
	private String message;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Email [type:"+ type +", name:"+ name +", email:"+ email 
				+", subject:"+ subject +", message:"+ message +"]";
	}


}
