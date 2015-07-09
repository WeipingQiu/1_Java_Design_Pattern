package com.qiuweiping.dp_12_flyweight.foundation;

import com.qiuweiping.util.Trace;

public class FlywightCircle implements IFlywightShape{

	private String color;
	private int x, y, radius;
	private Trace trace = Trace.getInstance();
	
	public FlywightCircle(String color) {
		this.color = color;
	}
	public void draw() {
		trace.log("FlywightCircle Circle.draw() with color:"+this.color+"\n");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	

}
