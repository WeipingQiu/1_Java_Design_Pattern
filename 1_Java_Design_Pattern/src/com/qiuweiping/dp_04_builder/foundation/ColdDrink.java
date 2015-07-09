package com.qiuweiping.dp_04_builder.foundation;

public abstract class ColdDrink implements Item{

	public Packing packing() {
		return new Bottle();
	}

	public abstract float price();

}
