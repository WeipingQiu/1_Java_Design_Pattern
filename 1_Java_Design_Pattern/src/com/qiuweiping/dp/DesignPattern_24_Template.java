package com.qiuweiping.dp;

public abstract class DesignPattern_24_Template {

	protected abstract void initialize();
	protected abstract void startPlay();
	protected abstract void endPlay();
	
	// Template method
	public final void play() {
		initialize();
		startPlay();
		endPlay();
	}
}
