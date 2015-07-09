package com.qiuweiping.dp_15_command.foundation;

public class SellStock implements Order{

	private Stock eStock;
	
	public SellStock(Stock stock) {
		this.eStock = stock;
	}
	public void execute() {
		eStock.sell();
	}

}
