package com.qiuweiping.dp;

import com.qiuweiping.dp_03_abs_factory.foundation.AbstractFactory;
import com.qiuweiping.dp_03_abs_factory.foundation.ColorFactory;
import com.qiuweiping.dp_03_abs_factory.foundation.ShapeFactory;

public class DesignPattern_03_Abstract_Factory {

	public static AbstractFactory getFactory(String option) {
		if(option.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if(option.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}
		return null;
	}
}
