package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_12_flyweight.foundation.FlywightCircle;
import com.qiuweiping.dp_12_flyweight.foundation.IFlywightShape;

public class Test_DesignPattern_12_Flyweight {

	private static final String colors[] = {"Red", "Green", "Yellow","Blue","White"};
	@Before
	public void beforeTest() {
		
	}
	
	@After
	public void afterTest() {
		
	}
	
	@Test
	public void test() {
		for(int i = 0; i < 50; i++) {
			FlywightCircle circle = (FlywightCircle) DesignPattern_12_Flyweight.getCircle(getRandomColor());
			circle.draw();
		}
	}

	private String getRandomColor() {
		
		return this.colors[(int) (Math.random()*colors.length)];
	}
}
