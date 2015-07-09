package com.qiuweiping.dp;

import java.util.logging.Logger;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_DesignPattern_01_Singleton_Lazy{

	private static Logger logger = Logger.getLogger(Test_DesignPattern_01_Singleton_Lazy.class.toString());
	
	@Test
	public void testUniqueInstance() {
		//DesignPattern_1_Singleton_Lazy shouldFail = new DesignPattern_1_Singleton_Lazy();
		// no access right.
		DesignPattern_01_Singleton_Lazy instance1 = DesignPattern_01_Singleton_Lazy.getInstance();
		DesignPattern_01_Singleton_Lazy instance2 = DesignPattern_01_Singleton_Lazy.getInstance();
		
		Assert.assertEquals(true, instance1 == instance2);
		Assert.assertSame(instance1, instance2);
		Assert.assertTrue("assert true", instance1.equals(instance2));
		logger.info("Test Done");
	}
}
