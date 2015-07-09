package com.qiuweiping.dp;

import com.qiuweiping.dp_02_factory.foundation.IShape;
import com.qiuweiping.dp_10_decorator.foundation.ShapeDecorator;
import com.qiuweiping.util.Trace;

public class DesignPattern_10_Decorator extends ShapeDecorator{

	Trace trace = Trace.getInstance();
	
	public DesignPattern_10_Decorator(IShape decoratedShape) {
		super(decoratedShape);
	}

	public String getMsg() {
		return null;
	}
	
	public void draw() {
		decoratedShape.draw();
		this.setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(IShape decoratorShape) {
		trace.log("Red decorator\n");
	}

}
