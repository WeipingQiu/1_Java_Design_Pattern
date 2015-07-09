package com.qiuweiping.dp_04_builder.foundation;

import java.util.ArrayList;
import java.util.List;

import com.qiuweiping.util.Trace;

public class Meal {
	private List<Item> items = new ArrayList<Item>();
	Trace trace = Trace.getInstance();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public float getCost() {
		float cost = 0.00f;
		for(Item item: items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showAllItem() {
		for(Item item: items) {
			trace.log("Item: "+item.name());
			trace.log(", Packing: "+ item.packing().pack());
			trace.log(", Price: "+item.price());
			trace.log("\n");
		}
	}
}
