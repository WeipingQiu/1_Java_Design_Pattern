package com.qiuweiping.dp_14_chain.of.resp.foundation;

import com.qiuweiping.util.Trace;

public class FileLogger extends AbstractLogger{

	Trace trace = Trace.getInstance();
	
	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		trace.log("Debug logger:" + message +"\n");
	}

}
