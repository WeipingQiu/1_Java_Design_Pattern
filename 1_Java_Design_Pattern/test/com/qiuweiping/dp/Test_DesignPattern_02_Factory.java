package com.qiuweiping.dp;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_02_factory.foundation.Circle;
import com.qiuweiping.dp_02_factory.foundation.IShape;
import com.qiuweiping.dp_02_factory.foundation.Rectangle;
import com.qiuweiping.dp_02_factory.foundation.Square;

public class Test_DesignPattern_02_Factory {

	private DesignPattern_02_Factory factory;
	
	@Before
	public void beforeTest() {
		 factory = new DesignPattern_02_Factory();
	}
	
	@After
	public void afterTest() {
		factory = null;
		System.gc();
	}
	
	@Test
	public void testCircle() {
		IShape shape = factory.getShape("circle");
		shape.draw();
		if(shape instanceof Circle) {
			Circle circle = (Circle) shape;
			Assert.assertEquals(true, circle.getMsg().equalsIgnoreCase("circle"));
		} else {
			Assert.fail("Shape is not Circle");
		}
	}
	
	@Test
	public void testSquare() {
		IShape shape = factory.getShape("square");
		shape.draw();
		if(shape instanceof Square) {
			Square square = (Square) shape;
			Assert.assertEquals(true, square.getMsg().equalsIgnoreCase("square"));
		} else {
			Assert.fail("Shape is not square");
		}
	}
	
	@Test
	public void testRectangle() {
		IShape shape = factory.getShape("rectangle");
		shape.draw();
		if(shape instanceof Rectangle) {
			Rectangle rectangle = (Rectangle)shape;
			Assert.assertEquals(true, rectangle.getMsg().equalsIgnoreCase("rectangle"));
		} else {
			Assert.fail("Shape is not rectangle");
		}
	}
}
