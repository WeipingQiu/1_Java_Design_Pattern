package com.qiuweiping.dp_02_factory.foundation;

import java.util.logging.Logger;

public class Rectangle implements IShape{

	private Logger logger = Logger.getLogger(Rectangle.class.toString());
	
	public void draw() {
		logger.info("Rectangle.draw()");
	}
	
	public String getMsg() {
		return "rectangle";
	}

}
