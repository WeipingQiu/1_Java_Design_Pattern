package com.qiuweiping.dp_13_proxy.foundation;

import com.qiuweiping.util.Trace;

public class RealImage implements Image{

	private String fileName;
	
	Trace trace = Trace.getInstance();
	public RealImage(String fileName) {
		this.fileName = fileName;
		this.loadFromDisk(fileName);
	}
	public void display() {
		trace.log("RealIamge.display()\n");
	}
	private void loadFromDisk(String fileName) {
		trace.log("RealImage.loadFromDisk()\n");
	}

}
