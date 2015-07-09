package com.qiuweiping.dp_14_chain.of.resp.foundation;

import com.qiuweiping.util.Trace;

public class ErrorLogger extends AbstractLogger{

	Trace trace = Trace.getInstance();
	
	public ErrorLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		trace.log("ErrorLogger:"+message +"\n");
	}

}
