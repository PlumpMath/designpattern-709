package composite;

import java.util.ArrayList;
import java.util.List;

public class Floder implements File {
	private String name;
	
	private List<File> list = new ArrayList<File>();
	
	public Floder(String name) {
		super();
		this.name = name;
	}
	
	public void add(File f){
		list.add(f);
	}
	
	public void remove(File f){
		list.remove(f);
	}
	
	public File getFile(int index){
		return list.get(index);
	}
	
	@Override
	public void killVirus() {
		System.out.println("floder:"+name+",kill virus...");
		for(File f:list){
			f.killVirus();
		}
	}
	
}
