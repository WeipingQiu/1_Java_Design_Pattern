package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_07_bridge.foundation.GreenCircle;
import com.qiuweiping.dp_07_bridge.foundation.RedCircle;
import com.qiuweiping.dp_07_bridge.foundation.Shape;

public class Test_DesignPattern_07_Bridge {

	Shape redCircle;
	Shape greenCircle;
	
	@Before
	public void beforeTest() {
		redCircle = new DesignPattern_07_Bridge(100, 100, 50, new RedCircle());
		greenCircle = new DesignPattern_07_Bridge(99, 99, 49, new GreenCircle());
	}
	
	@After
	public void afterTest() {
		redCircle = null;
		greenCircle = null;
		System.gc();
	}
	
	@Test
	public void test() {
		redCircle.draw();
		greenCircle.draw();
	}
}
