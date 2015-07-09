package com.qiuweiping.dp_03_abs_factory.foundation;

import com.qiuweiping.dp_02_factory.foundation.Circle;
import com.qiuweiping.dp_02_factory.foundation.IShape;
import com.qiuweiping.dp_02_factory.foundation.Rectangle;
import com.qiuweiping.dp_02_factory.foundation.Square;

public class ShapeFactory extends AbstractFactory{

	@Override
	public IShape getShape(String shapeType) {
		if(shapeType == null || "".equals(shapeType.trim())) return null;
		
		if(shapeType.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("square")) {
			return new Square();
		} else if(shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		return null;
	}

	
	@Override
	public IColor getColor(String colorType) {
		return null;
	}

}
