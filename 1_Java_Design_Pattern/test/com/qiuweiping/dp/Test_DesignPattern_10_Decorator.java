package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_02_factory.foundation.Circle;
import com.qiuweiping.dp_02_factory.foundation.IShape;
import com.qiuweiping.dp_02_factory.foundation.Rectangle;

public class Test_DesignPattern_10_Decorator {

	IShape circle;
	IShape redCircle;
	IShape redRectangle;
	
	@Before
	public void beforeTest() {
		circle = new Circle();
		redCircle = new DesignPattern_10_Decorator(circle);
		redRectangle = new DesignPattern_10_Decorator(new Rectangle());
	}
	
	@After
	public void afterTest() {
		circle = null;
		redCircle = null;
		redRectangle = null;
		System.gc();
	}
	
	@Test
	public void test() {
		circle.draw();
		redCircle.draw();
		redRectangle.draw();
	}
}
