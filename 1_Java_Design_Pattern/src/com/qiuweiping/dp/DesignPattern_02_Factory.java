package com.qiuweiping.dp;

import com.qiuweiping.dp_02_factory.foundation.Circle;
import com.qiuweiping.dp_02_factory.foundation.IShape;
import com.qiuweiping.dp_02_factory.foundation.Rectangle;
import com.qiuweiping.dp_02_factory.foundation.Square;

public class DesignPattern_02_Factory {

	// Use IShape to get shape object --- rectange, circle, square
	public IShape getShape(String type) {
		if(type == null || "".equals(type.trim())) return null;
		
		if(type.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if(type.equalsIgnoreCase("square")) {
			return new Square();
		} else if(type.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}
