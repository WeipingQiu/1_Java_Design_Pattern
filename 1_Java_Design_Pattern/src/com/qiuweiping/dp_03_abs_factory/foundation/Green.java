package com.qiuweiping.dp_03_abs_factory.foundation;

import java.util.logging.Logger;

public class Green implements IColor{

	private Logger logger = Logger.getLogger(Green.class.toString());
	public void fill() {
		logger.info("Green.fill()");
	}

	public String getMsg() {
		return "Green";
	}

}
