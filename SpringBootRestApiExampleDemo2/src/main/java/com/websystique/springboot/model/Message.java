package com.websystique.springboot.model;
	
public class Message {

	private long id;
	
	private String message;

	public long getId() {
		return id;
	}

	public Message() {
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message(long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + "]";
	}
	
	

	}
