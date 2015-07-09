package com.qiuweiping.dp_03_abs_factory.foundation;

import java.util.logging.Logger;

public class Red implements IColor{

	private Logger logger = Logger.getLogger(Red.class.toString());
	public void fill() {
		logger.info("Red.fill()");
	}
	public String getMsg() {
		return "red";
	}

}
