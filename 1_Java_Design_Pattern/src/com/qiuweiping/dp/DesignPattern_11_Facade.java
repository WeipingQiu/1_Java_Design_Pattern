package com.qiuweiping.dp;

import com.qiuweiping.dp_02_factory.foundation.Circle;
import com.qiuweiping.dp_02_factory.foundation.IShape;
import com.qiuweiping.dp_02_factory.foundation.Rectangle;
import com.qiuweiping.dp_02_factory.foundation.Square;

public class DesignPattern_11_Facade {

	private IShape circle;
	private IShape rectangle;
	private IShape square;
	
	public DesignPattern_11_Facade() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle() {
		circle.draw();
	}
	public void drawRectangle() {
		rectangle.draw();
	}
	public void drawSquare() {
		square.draw();
	}
}
