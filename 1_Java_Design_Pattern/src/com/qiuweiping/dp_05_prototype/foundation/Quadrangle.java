package com.qiuweiping.dp_05_prototype.foundation;

import com.qiuweiping.util.Trace;

public class Quadrangle extends Graphic{

	Trace trace = Trace.getInstance();
	public Quadrangle() {
		this.type = "Quadrangle";
	}
	@Override
	void draw() {
		trace.log("Inside Quadrangle.draw(");
	}

}
