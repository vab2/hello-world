package com.vaibhav.hello.helloworld.dto;

public class HelloWorld {

	private String message;

	public HelloWorld(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Request Mapping value: Hello Mr. [message=" + message + "]";
	}

}
