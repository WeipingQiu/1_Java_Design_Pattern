package com.qiuweiping.dp;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_05_prototype.foundation.Graphic;
import com.qiuweiping.util.Trace;

public class Test_DesignPattern_05_Prototype {

	private Trace trace = Trace.getInstance();
	
	@Before
	public void beforeTest() {
		
	}
	
	@After
	public void afterTest() {
		
	}
	
	@Test
	public void testPrototype() {
		DesignPattern_05_Prototype.loadCache();
		
		Graphic pentagon = DesignPattern_05_Prototype.getGraphic("1");
		Graphic quadrangle = DesignPattern_05_Prototype.getGraphic("2");
		Graphic triangle = DesignPattern_05_Prototype.getGraphic("3");
		
		Assert.assertEquals("Pentagon", pentagon.getType());
		Assert.assertEquals("Quadrangle", quadrangle.getType());
		Assert.assertEquals("Triangle", triangle.getType());
		
	}
}
