package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_15_command.foundation.BuyStock;
import com.qiuweiping.dp_15_command.foundation.SellStock;
import com.qiuweiping.dp_15_command.foundation.Stock;

public class Test_DesignPattern_15_Command {

	Stock stock = null;
	BuyStock buyStock;
	SellStock sellStock;
	
	@Before
	public void beforeTest() {
		stock = new Stock();
		buyStock = new BuyStock(stock);
		sellStock = new SellStock(stock);
	}
	@After
	public void afterTest() {
		stock = null;
		buyStock = null;
		sellStock = null;
		System.gc();
	}
	@Test
	public void test() {
		DesignPattern_15_Command commands = new DesignPattern_15_Command();
		commands.takeOrder(buyStock);
		commands.takeOrder(sellStock);
		
		commands.placeOrders();
	}
}
