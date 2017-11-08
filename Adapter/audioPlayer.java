package Adapter;
/*
 * Author: Dinesh Kalia
 * 
 * Implements the audiInterface.
 */
public class audioPlayer implements audioInterface {

	//plays the audio file.
	@Override
	public void playAsAudio(String filename) {
		System.out.println("Playing " + filename + " as audio file.");
		
	}

}
