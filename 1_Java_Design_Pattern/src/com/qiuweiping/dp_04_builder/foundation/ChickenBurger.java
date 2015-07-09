package com.qiuweiping.dp_04_builder.foundation;

public class ChickenBurger extends Burger{

	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float price() {
		return 10f;
	}

}
