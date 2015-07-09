package com.qiuweiping.dp;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.qiuweiping.dp_02_factory.foundation.Circle;
import com.qiuweiping.dp_02_factory.foundation.IShape;
import com.qiuweiping.dp_03_abs_factory.foundation.AbstractFactory;
import com.qiuweiping.dp_03_abs_factory.foundation.IColor;
import com.qiuweiping.dp_03_abs_factory.foundation.Red;

public class Test_DesignPattern_03_Abstract_Factory {
	
	@Before
	public void before() {
	}
	
	@Test
	public void testShapeFactoryCircle() {
		AbstractFactory shapeFactory = DesignPattern_03_Abstract_Factory.getFactory("Shape");
		
		IShape shape = shapeFactory.getShape("circle");
		shape.draw();
		if(shape instanceof Circle) {
			Circle circle = (Circle) shape;
			Assert.assertEquals(true, circle.getMsg().equalsIgnoreCase("circle"));
		} else {
			Assert.fail("Shape is not Circle");
		}
	}
	
	@Test
	public void testColorFactoryRed() {
		AbstractFactory colorFactory = DesignPattern_03_Abstract_Factory.getFactory("Color");
		IColor color = colorFactory.getColor("Red");
		color.fill();
		
		if(color instanceof Red) {
			Red red = (Red) color;
			Assert.assertEquals(true, red.getMsg().equalsIgnoreCase("red"));
		} else {
			Assert.fail("Color is not Red");
		}
	}
}
