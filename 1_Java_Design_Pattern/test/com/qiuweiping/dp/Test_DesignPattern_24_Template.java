package com.qiuweiping.dp;

import org.junit.Test;

import com.qiuweiping.dp_24_template.foundation.Cricket;
import com.qiuweiping.dp_24_template.foundation.Football;

public class Test_DesignPattern_24_Template {

	@Test
	public void testCricket() {
		DesignPattern_24_Template cricket = new Cricket();
		cricket.play();
	}
	@Test
	public void testFootball() {
		DesignPattern_24_Template football = new Football();
		football.play();
	}
}
