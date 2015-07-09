package com.qiuweiping.dp;

import com.qiuweiping.dp_04_builder.foundation.ChickenBurger;
import com.qiuweiping.dp_04_builder.foundation.Coke;
import com.qiuweiping.dp_04_builder.foundation.Meal;
import com.qiuweiping.dp_04_builder.foundation.Pepsi;
import com.qiuweiping.dp_04_builder.foundation.VegBurger;

public class DesignPattern_04_Builder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
