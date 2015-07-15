package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_21_state.foundation.StartState;
import com.qiuweiping.dp_21_state.foundation.StopState;

public class Test_DesignPattern_21_State {

	DesignPattern_21_State context;
	StartState startState;
	StopState stopState;
	
	@Before
	public void beforeTest() {
		context = new DesignPattern_21_State();
		startState = new StartState();
		stopState = new StopState();
	}
	
	@After
	public void afterTest() {
		context = null;
		startState = null;
		stopState = null;
	}
	@Test
	public void test() {
		startState.doAction(context);
		System.out.println(context.getState().toString());
		
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}
}
