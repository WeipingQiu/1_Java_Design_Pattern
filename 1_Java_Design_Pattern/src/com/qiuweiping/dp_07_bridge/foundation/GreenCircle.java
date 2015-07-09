package com.qiuweiping.dp_07_bridge.foundation;

import com.qiuweiping.util.Trace;

public class GreenCircle implements DrawAPI{

	private Trace trace = Trace.getInstance();

	public void drawCircle(int radius, int x, int y) {
		trace.log("Draw Green Circle. radius:"+radius +" ,x:"+x +" ,y:"+y+"\n");
	}
	
}
