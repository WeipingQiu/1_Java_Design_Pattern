package com.qiuweiping.dp_03_abs_factory.foundation;

import com.qiuweiping.dp_02_factory.foundation.Circle;
import com.qiuweiping.dp_02_factory.foundation.IShape;
import com.qiuweiping.dp_02_factory.foundation.Rectangle;
import com.qiuweiping.dp_02_factory.foundation.Square;

public class ColorFactory extends AbstractFactory{

	@Override
	public IColor getColor(String colorType) {
		if(colorType == null || "".equals(colorType.trim())) return null;
		
		if(colorType.equalsIgnoreCase("red")) {
			return new Red();
		} else if(colorType.equalsIgnoreCase("green")) {
			return new Green();
		} else if(colorType.equalsIgnoreCase("blue")) {
			return new Blue();
		}
		return null;
	}

	@Override
	public IShape getShape(String shapeType) {
		return null;
	}

}
