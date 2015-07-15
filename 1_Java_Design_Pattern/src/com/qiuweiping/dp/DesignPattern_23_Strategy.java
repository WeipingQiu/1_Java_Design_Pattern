package com.qiuweiping.dp;

import com.qiuweiping.dp_23_strategy.foundation.Strategy;

public class DesignPattern_23_Strategy {

	private Strategy strategy;
	
	public DesignPattern_23_Strategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int a, int b) {
		return this.strategy.doAction(a, b);
	}
}
