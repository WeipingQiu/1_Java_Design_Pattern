package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_12_flyweight.foundation.FlywightCircle;
import com.qiuweiping.dp_13_proxy.foundation.Image;

public class Test_DesignPattern_13_Proxy {

	@Before
	public void beforeTest() {
		
	}
	
	@After
	public void afterTest() {
		
	}
	
	@Test
	public void test() {
		Image image = new DesignPattern_13_ProxyImage("faked.jpeg");
		image.display();
		
		image.display();
	}
}
