package com.qiuweiping.dp;

import com.qiuweiping.dp_14_chain.of.resp.foundation.AbstractLogger;
import com.qiuweiping.dp_14_chain.of.resp.foundation.ConsoleLogger;
import com.qiuweiping.dp_14_chain.of.resp.foundation.ErrorLogger;
import com.qiuweiping.dp_14_chain.of.resp.foundation.FileLogger;

public class DesignPattern_14_Chain {

	public AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}
}
