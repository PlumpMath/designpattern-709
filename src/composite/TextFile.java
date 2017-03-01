package composite;

public class TextFile implements File {
	private String name;
	
	public TextFile(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void killVirus() {
		System.out.println("--text file:" + name + ",kill virus...");
	}

}
