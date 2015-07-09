package com.qiuweiping.dp_06_adapter.foundation;

import com.qiuweiping.util.Trace;

public class VlcPlayer implements AdvancedMediaPlayer{

	private Trace trace = Trace.getInstance();
	
	public void playVlc(String fileName) {
		trace.log("VlcPlayer.playVlc() with file: "+ fileName +"\n");
	}

	public void playMp4(String fileName) {
		// Do nothing.
	}

}
