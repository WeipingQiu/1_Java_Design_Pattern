package com.qiuweiping.dp_05_prototype.foundation;

import com.qiuweiping.util.Trace;

public class Pentagon extends Graphic{

	Trace trace = Trace.getInstance();
	public Pentagon() {
		this.type = "Pentagon";
	}
	@Override
	void draw() {

		trace.log("Inside Pentagon.draw");
	}

}
