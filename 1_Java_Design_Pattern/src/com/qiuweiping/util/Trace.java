package com.qiuweiping.util;

public class Trace {

	private Trace() {};
	private  static Trace instance;
	// Singleton
	public static Trace getInstance() {
		if(instance == null) {
			instance = new Trace();
		}
		return instance;
	}
	public void log(String str) {
		System.out.print(str);
	}
}
