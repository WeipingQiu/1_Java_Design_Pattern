package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_16_interpreter.foundation.Expression;
import com.qiuweiping.dp_16_interpreter.foundation.OrExpression;
import com.qiuweiping.util.Trace;

public class Test_DesignPattern_16_Interpreter {

	DesignPattern_16_Interpreter interpreter;
	Trace trace  = Trace.getInstance();
	
	@Before
	public void beforeTest() {
		interpreter = new DesignPattern_16_Interpreter();
	}
	@After
	public void afterTest() {
		
	}
	
	@Test
	public void test() {
		Expression isMale = interpreter.getMaleExpression();
		Expression isMarriedWoman = interpreter.getMarriedWomanExpression();
		
		trace.log("John is male?" + isMale.interpret("John") +"\n");
		trace.log("Julie is a married woman?" + isMarriedWoman.interpret("Julie") +"\n");
		
	}
}
