package com.qiuweiping.dp_20_observer.foundation;

import com.qiuweiping.dp.DesignPattern_20_Observer;

public class BinaryObserver extends Observer{

	public BinaryObserver(DesignPattern_20_Observer subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("Binary String:"
	        + Integer.toBinaryString(this.subject.getState()));
		
	}
	

}
