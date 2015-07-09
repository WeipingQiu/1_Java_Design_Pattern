package com.qiuweiping.dp_14_chain.of.resp.foundation;

public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	// next element in chain
	protected AbstractLogger nextLogger;
	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		if(this.level <= level) {
			write(message);
		}
		if(this.nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);
}
