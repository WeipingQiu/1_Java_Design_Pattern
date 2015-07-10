package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_18_mediator.foundation.User;

public class Test_DesignPattern_18_Mediator {

	@Before
	public void beforeTest() {
		
	}
	@After 
	public void afterTest() {
		
	}
	@Test
	public void test() {
		User john = new User("John");
		User robert = new User("Robert");
		
		john.sendMessage("Hi Robert");
		robert.sendMessage("Hi John");
	}
}
