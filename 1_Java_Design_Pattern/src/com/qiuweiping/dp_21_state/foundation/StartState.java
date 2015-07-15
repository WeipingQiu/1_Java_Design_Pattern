package com.qiuweiping.dp_21_state.foundation;

import com.qiuweiping.dp.DesignPattern_21_State;
import com.qiuweiping.util.Trace;

public class StartState implements State{

	Trace trace = Trace.getInstance();
	
	public void doAction(DesignPattern_21_State context) {
		trace.log("Start \n");
		context.setState(this);
	}

	public String toString() {
		return "Start state";
	}
}
