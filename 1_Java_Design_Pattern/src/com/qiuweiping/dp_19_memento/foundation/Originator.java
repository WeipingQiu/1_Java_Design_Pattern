package com.qiuweiping.dp_19_memento.foundation;

public class Originator {

	private String state;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	
	public Memento saveStateToMemento() {
		return new Memento(this.state);
	}
	
	public void retrieveStateFromMemento(Memento memento) {
		this.state = memento.getState();
	}
}
