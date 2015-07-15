package com.qiuweiping.dp;

import com.qiuweiping.dp_22_nullobject.foundation.AbstractCustomer;
import com.qiuweiping.dp_22_nullobject.foundation.NullCustomer;
import com.qiuweiping.dp_22_nullobject.foundation.RealCustomer;

public class DesignPattern_22_NullObject {

	public static final String[] names = {"Robert","Diana","David","Jessica"};
	
	public static AbstractCustomer getCustomer(String name) {
		for(int i = 0; i < names.length; i++) {
			if(names[i].equalsIgnoreCase(name)) {
				return new RealCustomer(name);
			}
		}
		return new NullCustomer();
	}
}
