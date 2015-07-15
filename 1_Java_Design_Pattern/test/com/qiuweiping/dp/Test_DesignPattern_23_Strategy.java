package com.qiuweiping.dp;

import org.junit.Test;

import com.qiuweiping.dp_23_strategy.foundation.AddOperation;
import com.qiuweiping.dp_23_strategy.foundation.MultiplyOperation;
import com.qiuweiping.dp_23_strategy.foundation.SubOperation;
import com.qiuweiping.util.Trace;

public class Test_DesignPattern_23_Strategy {

	@Test
	public void test() {
		DesignPattern_23_Strategy context = new DesignPattern_23_Strategy(new AddOperation() );
		Trace.getInstance().log(Integer.toString(context.executeStrategy(10, 5)));
		Trace.getInstance().log("\n");
		
		context = new DesignPattern_23_Strategy(new SubOperation() );
		Trace.getInstance().log(Integer.toString(context.executeStrategy(10, 5)));
		Trace.getInstance().log("\n");
		
		context = new DesignPattern_23_Strategy(new MultiplyOperation() );
		Trace.getInstance().log(Integer.toString(context.executeStrategy(10, 5)));
		Trace.getInstance().log("\n");
	}
}
