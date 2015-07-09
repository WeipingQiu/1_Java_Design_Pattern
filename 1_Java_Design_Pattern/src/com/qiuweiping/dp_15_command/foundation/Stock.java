package com.qiuweiping.dp_15_command.foundation;

import com.qiuweiping.util.Trace;

public class Stock {
	private String name = "Ericsson";
	private int quantity = 10;
	private Trace trace = Trace.getInstance();
	
	public void buy() {
		trace.log("Stock["+this.name+" ,"+this.quantity+"] bought\n");
	}
	
	public void sell() {
		trace.log("Stock["+this.name+" ,"+this.quantity+"] sold\n");
	}
}
