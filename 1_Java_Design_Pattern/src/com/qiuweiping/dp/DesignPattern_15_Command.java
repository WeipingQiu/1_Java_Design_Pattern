package com.qiuweiping.dp;

import java.util.ArrayList;
import java.util.List;

import com.qiuweiping.dp_15_command.foundation.BuyStock;
import com.qiuweiping.dp_15_command.foundation.Order;
import com.qiuweiping.dp_15_command.foundation.SellStock;
import com.qiuweiping.util.Trace;

public class DesignPattern_15_Command {

	private Trace trace = Trace.getInstance();
	
	private List<Order> orderList = new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		if(order instanceof BuyStock) {
			trace.log("Instanceof Buy order\n");
		} else if (order instanceof SellStock) {
			trace.log("Instanceof Sell order\n");
		}
		orderList.add(order);
	}
	
	public void placeOrders() {
		for(Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}
}
