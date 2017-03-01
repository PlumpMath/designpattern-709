package composite;

public class VideoFile implements File {
	private String name;
	
	public VideoFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirus() {
		System.out.println("--video file:" + name + ",kill virus...");
	}

}
