package com.qiuweiping.dp;

import org.junit.Test;

import com.qiuweiping.dp_22_nullobject.foundation.AbstractCustomer;
import com.qiuweiping.util.Trace;

public class Test_DesignPattern_22_Nullobject {

	@Test
	public void test() {
		AbstractCustomer david = DesignPattern_22_NullObject.getCustomer("david");
		AbstractCustomer who = DesignPattern_22_NullObject.getCustomer("who");
		Trace.getInstance().log(david.getName()+"\n");
		Trace.getInstance().log(who.getName());
		
	}
}
