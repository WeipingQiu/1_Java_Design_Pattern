package com.qiuweiping.dp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_DesignPattern_06_Adapter {

	DesignPattern_06_Adapter audioPlayer;
	
	@Before
	public void beforeTest() {
		 audioPlayer = new DesignPattern_06_Adapter();
	}
	
	@After
	public void afterTest() {
		audioPlayer = null;
		System.gc();
	}
	
	@Test
	public void testAdapter() {
		audioPlayer.play("mp3", "song.mp3");
		audioPlayer.play("vlc", "song.vlc");
		audioPlayer.play("mp3", "song.mp4");
		audioPlayer.play("rm", "song.rm");
	}
}
