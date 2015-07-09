package com.qiuweiping.dp_06_adapter.foundation;

import com.qiuweiping.util.Trace;


public class Mp4Player implements AdvancedMediaPlayer {

	private Trace trace = Trace.getInstance();
	
	public void playMp4(String fileName) {
		trace.log("VlcPlayer.playMp4() with file: "+ fileName +"\n");
		
	}
	
	public void playVlc(String fileName) {
		// Do nothing.
	}
}
