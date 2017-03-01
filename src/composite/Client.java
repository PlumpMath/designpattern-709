package composite;

public class Client {

	public static void main(String[] args) {
		// 组合模式定义了如何将容器对象和叶子对象进行递归组合，使得客户在使用的过程中无须进行区分，可以对他们进行一致的处理。
		// 组合模式具有天然的递归特性
		
		Floder base = new Floder("根目录");
		base.add(new ImageFile("dog.jpg"));
		base.add(new TextFile("readme.txt"));
		Floder floder1 = new Floder("我的收藏");
		floder1.add(new VideoFile("苍老师.avi"));
		floder1.add(new VideoFile("建国大业.avi"));
		floder1.add(new TextFile("java in depth.txt"));
		base.add(floder1);
		
		base.killVirus();
	}

}
