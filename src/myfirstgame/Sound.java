package myfirstgame;

import java.applet.Applet;
import java.applet.AudioClip;

public class Sound {

	public static final Sound sound1 = new Sound("/gameover.wav"); 
	public static final Sound sound2 = new Sound("/f1.wav"); 
	public static final Sound sound3 = new Sound("/boo.wav"); 
	
	private AudioClip clip;
	public Sound(String file) {
		try {
			clip = Applet.newAudioClip(Sound.class.getResource(file));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void play() {
		try {
			new Thread() {
				public void run() {
					clip.play();
				}
			}.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
