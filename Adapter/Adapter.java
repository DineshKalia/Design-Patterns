package Adapter;
/*
 * Author: Dinesh Kalia
 * 
 * Implements the audioInterface. This class works as bridge
 * between audioInterface and videoInterface.
 */
public class Adapter implements audioInterface {
	//make video object.
	public videoInterface video;
	
	public Adapter(videoInterface video) {
		super();
		this.video = video;
	}
	
	//get the audoFile and use adapter to play as videoFile
	@Override
	public void playAsAudio(String filename) {
		System.out.printf("Using adapter: ");
		video.playAsVideo(filename);
	}

}
