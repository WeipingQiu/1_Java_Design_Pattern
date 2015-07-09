package com.qiuweiping.dp;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.qiuweiping.dp_04_builder.foundation.Meal;

public class Test_DesignPattern_04_Builder {

	DesignPattern_04_Builder mealBuilder = null;
	
	@Before
	public void setup() {
		mealBuilder = new DesignPattern_04_Builder();
	}
	
	@After
	public void afterTest() {
		mealBuilder = null;
		System.gc();
	}
	
	@Test 
	public void testVegMeal() {
		Meal vegMeal = mealBuilder.prepareVegMeal();
		vegMeal.showAllItem();
		Assert.assertEquals(55.0f, vegMeal.getCost());
	}
	
	@Test 
	public void testNonVegMeal() {
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showAllItem();
		Assert.assertEquals(15.0f, nonVegMeal.getCost());
	}
	
}
