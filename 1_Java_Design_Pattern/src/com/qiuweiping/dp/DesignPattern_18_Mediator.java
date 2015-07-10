package com.qiuweiping.dp;

import java.util.Date;

import com.qiuweiping.dp_18_mediator.foundation.User;
import com.qiuweiping.util.Trace;

public class DesignPattern_18_Mediator {
	private static Trace trace = Trace.getInstance();
	public static void comminication(User user, String msg) {
		trace.log(new Date().toLocaleString() + "["+ user.getName()+"]:"+msg+"\n");
	}
}
