package composite;

public class ImageFile implements File {
	private String name;
	
	public ImageFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirus() {
		System.out.println("--image file:" + name + ",kill virus...");
	}

}
