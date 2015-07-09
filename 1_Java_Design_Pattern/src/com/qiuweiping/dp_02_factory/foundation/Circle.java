package com.qiuweiping.dp_02_factory.foundation;

import java.util.logging.Logger;

public class Circle implements IShape{

	private static Logger logger = Logger.getLogger(Circle.class.toString());
	
	public void draw() {
		logger.info("Circle.draw()");
	}
	
	public String getMsg() {
		return "circle";
	}

}
