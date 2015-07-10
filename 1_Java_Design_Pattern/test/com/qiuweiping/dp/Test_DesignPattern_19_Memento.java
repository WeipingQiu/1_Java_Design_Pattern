package com.qiuweiping.dp;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_19_memento.foundation.Memento;
import com.qiuweiping.dp_19_memento.foundation.Originator;

public class Test_DesignPattern_19_Memento {

	@Before
	public void beforeTest() {
		
	}
	@After
	public void afterTest() {
		
	}
	@Test
	public void test() {
		Originator originator = new Originator();
		DesignPattern_19_Memento memento = new DesignPattern_19_Memento();
		
		originator.setState("1");
		originator.setState("2");
		
		memento.add(originator.saveStateToMemento());
		originator.setState("3");
		memento.add(originator.saveStateToMemento());
		originator.setState("4");
		memento.add(originator.saveStateToMemento());
		originator.setState("5");
		
		System.out.println("Current statis is "+originator.getState());
		
		List<Memento> memenToList = memento.getMementoList();
		if(memenToList.size() > 0 ) {
			for(int i = memenToList.size() - 1; i>0; i--) {
				originator.retrieveStateFromMemento(memenToList.get(i));
				System.out.println("The saved state is " + originator.getState());
			}
		}
		
		
		
		
	}
}
