package com.qiuweiping.dp;

import java.util.ArrayList;
import java.util.List;

import com.qiuweiping.dp_19_memento.foundation.Memento;

public class DesignPattern_19_Memento {

	private List<Memento>  mementoList = new ArrayList<Memento>();
	private static int mementolistIndex = 0;
	
	public void add(Memento memento) {
		mementoList.add(mementolistIndex++, memento);
	}
	public Memento get(int index) {
		return mementoList.get(index);
	}
	public List<Memento> getMementoList() {
		return this.mementoList;
	}
}
