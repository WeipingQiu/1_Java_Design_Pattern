package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_14_chain.of.resp.foundation.AbstractLogger;


public class Test_DesignPattern_14_Chain {

	DesignPattern_14_Chain chain;
	@Before
	public void beforeTest() {
		chain = new DesignPattern_14_Chain();
	}
	
	@After
	public void afterTest() {
		chain = null;
		System.gc();
	}
	
	@Test
	public void test() {
		AbstractLogger loggerChain = chain.getChainOfLoggers();
		System.out.println("Start");
		loggerChain.logMessage(AbstractLogger.INFO, "Information message");
		System.out.println("part 1 done");
		loggerChain.logMessage(AbstractLogger.DEBUG, "Debug message");
		System.out.println("part 2 done");
		loggerChain.logMessage(AbstractLogger.ERROR, "Error message");
		System.out.println("Done");
		
	}

}
