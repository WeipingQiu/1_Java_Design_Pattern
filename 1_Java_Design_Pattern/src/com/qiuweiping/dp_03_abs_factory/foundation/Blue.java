package com.qiuweiping.dp_03_abs_factory.foundation;

import java.util.logging.Logger;

public class Blue implements IColor{

	private static Logger logger = Logger.getLogger(Blue.class.toString());
	public void fill() {
		logger.info("Blue.fill()");
	}

	public String getMsg() {
		return "Blue";
	}

}
