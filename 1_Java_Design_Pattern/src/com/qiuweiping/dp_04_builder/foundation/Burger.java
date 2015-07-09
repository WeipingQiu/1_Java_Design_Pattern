package com.qiuweiping.dp_04_builder.foundation;

public abstract class Burger implements Item{

	public Packing packing() {
		return new Wrapper();
	}

	public abstract float price();

}
