package com.qiuweiping.dp;

public class DesignPattern_01_Singleton_Lazy {

	/*
	 * 1. private static
	 * 2. private constructor
	 */
	
	private static DesignPattern_01_Singleton_Lazy instance;
	private DesignPattern_01_Singleton_Lazy() {}
	public static DesignPattern_01_Singleton_Lazy getInstance() {
		if(instance == null) {
			instance = new DesignPattern_01_Singleton_Lazy();
		}
		return instance;
	}
}
