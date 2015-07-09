package com.qiuweiping.dp_10_decorator.foundation;

import com.qiuweiping.dp_02_factory.foundation.IShape;

public abstract class ShapeDecorator implements IShape{

	protected IShape decoratedShape;
	
	public ShapeDecorator(IShape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}
	
	public void draw() {
		decoratedShape.draw();
	}
}
