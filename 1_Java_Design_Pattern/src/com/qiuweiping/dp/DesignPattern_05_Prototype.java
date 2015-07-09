package com.qiuweiping.dp;

import java.util.Hashtable;

import com.qiuweiping.dp_05_prototype.foundation.Graphic;
import com.qiuweiping.dp_05_prototype.foundation.Pentagon;
import com.qiuweiping.dp_05_prototype.foundation.Quadrangle;
import com.qiuweiping.dp_05_prototype.foundation.Triangle;

public class DesignPattern_05_Prototype {

	private static Hashtable<String, Graphic> graphicMap = new Hashtable<String, Graphic>();
	
	public static Graphic getGraphic(String graphicId) {
		Graphic cachedGraphic = graphicMap.get(graphicId);
		return (Graphic)cachedGraphic.clone();
	}
	
	public static void loadCache() {
		Pentagon pentagon  = new Pentagon();
		pentagon.setId("1");
		
		Quadrangle quadrangle = new Quadrangle();
		quadrangle.setId("2");
		
		Triangle triangle = new Triangle();
		triangle.setId("3");
		
		graphicMap.put(pentagon.getId(), pentagon);
		graphicMap.put(quadrangle.getId(), quadrangle);
		graphicMap.put(triangle.getId(), triangle);
		
	}
}
