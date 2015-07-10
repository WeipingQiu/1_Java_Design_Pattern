package com.qiuweiping.dp_20_observer.foundation;

import com.qiuweiping.dp.DesignPattern_20_Observer;

public class OctalObserver extends Observer{

	public OctalObserver(DesignPattern_20_Observer subject) {
		this.subject = subject;
		this.subject.attach(this);
	}
	@Override
	public void update() {
		System.out.println("Oct String:"
		        + Integer.toOctalString(this.subject.getState()));
		
	}

}
