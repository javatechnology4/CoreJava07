package com.spring.hibernate;

public class Message {
	private Long id;
	private String message;
	private Message nextMessage;

	public Message() {
		// TODO Auto-generated constructor stub
	}

	public Message(String message) {
		this.message = message;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message getNextMessage() {
		return nextMessage;
	}

	public void setNextMessage(Message nextMessage) {
		this.nextMessage = nextMessage;
	}
	public static void main(String[] args) {
		Message message=new Message("Welcome to Hibernate");
		System.out.println(message.getMessage());
	}

}
