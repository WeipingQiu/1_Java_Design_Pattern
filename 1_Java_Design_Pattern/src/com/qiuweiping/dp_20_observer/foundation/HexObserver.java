package com.qiuweiping.dp_20_observer.foundation;

import com.qiuweiping.dp.DesignPattern_20_Observer;

public class HexObserver extends Observer{

	public HexObserver(DesignPattern_20_Observer subject) {
		this.subject  = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Hex String:"
		        + Integer.toHexString(this.subject.getState()).toUpperCase());
	}

}
