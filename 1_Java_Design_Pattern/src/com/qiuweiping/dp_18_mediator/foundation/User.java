package com.qiuweiping.dp_18_mediator.foundation;

import com.qiuweiping.dp.DesignPattern_18_Mediator;

public class User {

	private String name;

	public User(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void sendMessage(String message) {
		DesignPattern_18_Mediator.comminication(this, message);
	}
	
}
