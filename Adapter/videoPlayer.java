package Adapter;
/*
 * Author: Dinesh Kalia
 * 
 * Implements the videoInterface.
 */
public class videoPlayer implements videoInterface {

	//gets the audio file and plays it as video.
	@Override
	public void playAsVideo(String filename) {
		System.out.println("Playing " + filename + " as video file.");

	}

}
