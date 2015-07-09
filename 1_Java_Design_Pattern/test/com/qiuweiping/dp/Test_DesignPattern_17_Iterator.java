package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_17_iterator.foundation.Iterator;
import com.qiuweiping.util.Trace;

public class Test_DesignPattern_17_Iterator {

	DesignPattern_17_Iterator namesRepository;
	Trace trace = Trace.getInstance();
	
	@Before
	public void beforeTest() {
		namesRepository = new DesignPattern_17_Iterator();
	}
	@After 
	public void afterTest() {
		
	}
	@Test
	public void test() {
		Iterator it = namesRepository.getIterator();
		while(it.hasNext()) {
			String name  = (String) it.next();
			trace.log("Name: "+ name +"\n");
		}
		
	}
}
