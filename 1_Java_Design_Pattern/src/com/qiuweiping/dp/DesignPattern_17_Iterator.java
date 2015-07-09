package com.qiuweiping.dp;

import com.qiuweiping.dp_17_iterator.foundation.Container;
import com.qiuweiping.dp_17_iterator.foundation.Iterator;

public class DesignPattern_17_Iterator implements Container{

	public String names[] ={"Robert","Anne","Lora","John"};
	public Iterator getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {

		int index;
		
		public boolean hasNext() {
			if(index < names.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if(this.hasNext()) {
				return names[index++];
			}
			return null;
		}
		
	}

}
