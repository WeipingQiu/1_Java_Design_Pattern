package com.qiuweiping.dp_07_bridge.foundation;

public abstract class Shape {

	protected DrawAPI drawAPI;
	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}
	public abstract void draw();
}
