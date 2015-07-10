package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_20_observer.foundation.BinaryObserver;
import com.qiuweiping.dp_20_observer.foundation.HexObserver;
import com.qiuweiping.dp_20_observer.foundation.OctalObserver;

public class Test_DesignPattern_20_Observer {

	DesignPattern_20_Observer subject;
	BinaryObserver binObserver;
	OctalObserver octObserver;
	HexObserver hexObserver;
	
	
	@Before
	public void beforeTest() {
		subject = new DesignPattern_20_Observer();
		binObserver = new BinaryObserver(subject);
		octObserver  = new OctalObserver(subject);
		hexObserver = new HexObserver(subject);
	}
	@After
	public void afterTest() {
		subject = null;
		binObserver = null;
		octObserver  = null;
		hexObserver = null;
	}
	@Test
	public void test() {
		subject.setState(10);
		subject.setState(20);
	}
}
