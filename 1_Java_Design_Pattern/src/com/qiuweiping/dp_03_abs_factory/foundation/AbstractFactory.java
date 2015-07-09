package com.qiuweiping.dp_03_abs_factory.foundation;

import com.qiuweiping.dp_02_factory.foundation.IShape;

/*
 * create a factory of related objects.
 */
public abstract class AbstractFactory {
	public abstract IColor getColor(String colorType);
	public abstract IShape getShape(String shapeType);
}
