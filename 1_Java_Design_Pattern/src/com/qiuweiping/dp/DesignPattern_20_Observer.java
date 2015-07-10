package com.qiuweiping.dp;

import java.util.ArrayList;
import java.util.List;

import com.qiuweiping.dp_20_observer.foundation.Observer;

public class DesignPattern_20_Observer {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState() {
		return this.state;
	}
	
	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void notifyAllObservers() {
		for(Observer observer: observers) {
			observer.update();
		}
	}
}
