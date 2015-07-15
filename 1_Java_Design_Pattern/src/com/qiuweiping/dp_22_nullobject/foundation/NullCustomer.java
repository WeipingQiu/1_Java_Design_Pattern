package com.qiuweiping.dp_22_nullobject.foundation;

public class NullCustomer extends AbstractCustomer{

	public NullCustomer() {
	}
	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not able to find in DB";
	}

}
