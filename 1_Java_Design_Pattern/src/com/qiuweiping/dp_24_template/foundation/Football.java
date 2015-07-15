package com.qiuweiping.dp_24_template.foundation;

import com.qiuweiping.dp.DesignPattern_24_Template;
import com.qiuweiping.util.Trace;

public class Football extends DesignPattern_24_Template{

	Trace trace = Trace.getInstance();
	
	@Override
	public void initialize() {
		trace.log("Footbal init...\n");
	}

	@Override
	public void startPlay() {
		trace.log("Footbal start...\n");
	}

	@Override
	public void endPlay() {
		trace.log("Footbal end...\n");
	}

}
