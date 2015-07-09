package com.qiuweiping.dp_05_prototype.foundation;

import com.qiuweiping.util.Trace;

public class Triangle extends Graphic{

	Trace trace = Trace.getInstance();
	
	public Triangle() {
		this.type = "Triangle";
	}
	
	@Override
	void draw() {
		trace.log("Inside Triangle.draw()");
	}


}
