package com.qiuweiping.dp;

import com.qiuweiping.dp_13_proxy.foundation.Image;
import com.qiuweiping.dp_13_proxy.foundation.RealImage;
import com.qiuweiping.util.Trace;

public class DesignPattern_13_ProxyImage implements Image{

	private RealImage realImage;

	private String fileName;
	Trace trace = Trace.getInstance();
	
	public DesignPattern_13_ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	public void display() {
		if(realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
		
	}
	
}
