package com.qiuweiping.dp;

import com.qiuweiping.dp_06_adapter.foundation.MediaAdapter;
import com.qiuweiping.dp_06_adapter.foundation.MediaPlayer;
import com.qiuweiping.util.Trace;

public class DesignPattern_06_Adapter implements MediaPlayer{

	private MediaAdapter mediaAdapter;
	private Trace trace = Trace.getInstance();

	public void play(String audioType, String fileName) {

		if(audioType.equalsIgnoreCase("mp3")) {
			trace.log("Playing mp3 file: "+ fileName +"\n");
		} else if((audioType.equalsIgnoreCase("vlc")) 
			    ||(audioType.equalsIgnoreCase("mp4"))) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			trace.log("Not supported type: "+ audioType +"\n");
		}
	}
}
