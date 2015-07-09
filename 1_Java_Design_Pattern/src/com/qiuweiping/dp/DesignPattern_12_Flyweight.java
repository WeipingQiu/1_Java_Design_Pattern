package com.qiuweiping.dp;

import java.util.HashMap;

import com.qiuweiping.dp_12_flyweight.foundation.FlywightCircle;
import com.qiuweiping.dp_12_flyweight.foundation.IFlywightShape;
import com.qiuweiping.util.Trace;

public class DesignPattern_12_Flyweight {

	static Trace trace = Trace.getInstance();
	private static final HashMap<String, IFlywightShape> circleMap = new HashMap();
	public static IFlywightShape getCircle(String color) {
		FlywightCircle circle = (FlywightCircle) circleMap.get(color);
		if(circle == null) {
			circle = new FlywightCircle(color);
			circleMap.put(color, circle);
			trace.log("Add "+color+" into circleMap\n");
		} else {
			trace.log(">>>>>>>>>>>>>>>>>>>>>>>>>Hit in circleMap\n");
		}
		return circle;
	}
}
