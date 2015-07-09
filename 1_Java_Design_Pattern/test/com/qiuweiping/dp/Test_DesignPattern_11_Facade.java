package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_DesignPattern_11_Facade {

	@Before
	public void beforeTest() {
		
	}
	@After
	public void afterTest() {
		
	}
	@Test
	public void test() {
		DesignPattern_11_Facade shapeMaker = new DesignPattern_11_Facade();
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}
	
}
