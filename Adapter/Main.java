package Adapter;

/*
 * Author: Dinesh Kalia
 * 
 * Description: Adapter design is a structural pattern that
 * works as a bridge between two incompatible interfaces. 
 */

public class Main {

	public static void main(String[] args) {
		//make an audio file
		audioInterface audiofile = new audioPlayer();
		
		//audioPlayer object plays it correctly.
		audiofile.playAsAudio("song.mp3");
		
		//videoPlayer can play song.mp3 using adapter!
		audiofile = new Adapter(new videoPlayer());
		audiofile.playAsAudio("song.mp3");
	}

}
