package com.qiuweiping.dp_14_chain.of.resp.foundation;

import com.qiuweiping.util.Trace;

public class ConsoleLogger extends AbstractLogger{

	Trace trace = Trace.getInstance();
	
	public ConsoleLogger(int level) {
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		trace.log("Info.logger: "+ message +"\n");
	}
}
