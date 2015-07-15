package com.qiuweiping.dp;

import com.qiuweiping.dp_21_state.foundation.State;

public class DesignPattern_21_State {

	private State state;
	
	public DesignPattern_21_State() {
		state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
}
