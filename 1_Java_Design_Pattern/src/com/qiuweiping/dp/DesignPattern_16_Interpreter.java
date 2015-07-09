package com.qiuweiping.dp;

import com.qiuweiping.dp_16_interpreter.foundation.AndExpression;
import com.qiuweiping.dp_16_interpreter.foundation.Expression;
import com.qiuweiping.dp_16_interpreter.foundation.OrExpression;
import com.qiuweiping.dp_16_interpreter.foundation.TerminalExpression;

public class DesignPattern_16_Interpreter {
	
	// Rule: Robert and John are male
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		
		return new OrExpression(robert, john);
	}
	
	public static Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}
}
