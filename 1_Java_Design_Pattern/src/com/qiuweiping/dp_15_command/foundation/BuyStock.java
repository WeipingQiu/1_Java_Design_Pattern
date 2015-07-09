package com.qiuweiping.dp_15_command.foundation;

import com.qiuweiping.util.Trace;

public class BuyStock implements Order{

	private Stock eStock;
	
	public BuyStock(Stock stock) {
		this.eStock = stock;
	}
	
	public void execute() {
		eStock.buy();
	}

}
