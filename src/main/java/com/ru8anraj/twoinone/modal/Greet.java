package com.ru8anraj.twoinone.modal;

public class Greet {
	
	private final long id;
	private final String content;
	
	public Greet(long id, String content) {
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	
	
}