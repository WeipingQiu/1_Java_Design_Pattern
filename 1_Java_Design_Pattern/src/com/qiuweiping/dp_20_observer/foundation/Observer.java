package com.qiuweiping.dp_20_observer.foundation;

import com.qiuweiping.dp.DesignPattern_20_Observer;

public abstract class Observer {

	protected DesignPattern_20_Observer subject;
	public abstract void update();
}
