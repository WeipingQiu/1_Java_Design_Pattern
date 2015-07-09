package com.qiuweiping.dp_02_factory.foundation;

import java.util.logging.Logger;

public class Square implements IShape{

	private static Logger logger = Logger.getLogger(Square.class.toString());
	
	
	public void draw() {
		logger.info("Square.draw()");
	}

	public String getMsg() {
		return "square";
	}
}
