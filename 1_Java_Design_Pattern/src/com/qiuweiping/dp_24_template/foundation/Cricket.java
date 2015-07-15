package com.qiuweiping.dp_24_template.foundation;

import com.qiuweiping.dp.DesignPattern_24_Template;
import com.qiuweiping.util.Trace;

public class Cricket extends DesignPattern_24_Template{

	Trace trace = Trace.getInstance();
	
	@Override
	public void initialize() {
		trace.log("Cricket init...\n");
	}

	@Override
	public void startPlay() {
		trace.log("Cricket start...\n");
	}

	@Override
	public void endPlay() {
		trace.log("Cricket end...\n");
	}

}
