package com.qiuweiping.dp;

import com.qiuweiping.dp_07_bridge.foundation.DrawAPI;
import com.qiuweiping.dp_07_bridge.foundation.Shape;
import com.qiuweiping.util.Trace;

public class DesignPattern_07_Bridge extends Shape {

	private Trace trace = Trace.getInstance();
	private int radius, x, y;
	
	protected DesignPattern_07_Bridge(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

}
