package composite;

public class Client {

	public static void main(String[] args) {
		// ���ģʽ��������ν����������Ҷ�Ӷ�����еݹ���ϣ�ʹ�ÿͻ���ʹ�õĹ���������������֣����Զ����ǽ���һ�µĴ���
		// ���ģʽ������Ȼ�ĵݹ�����
		
		Floder base = new Floder("��Ŀ¼");
		base.add(new ImageFile("dog.jpg"));
		base.add(new TextFile("readme.txt"));
		Floder floder1 = new Floder("�ҵ��ղ�");
		floder1.add(new VideoFile("����ʦ.avi"));
		floder1.add(new VideoFile("������ҵ.avi"));
		floder1.add(new TextFile("java in depth.txt"));
		base.add(floder1);
		
		base.killVirus();
	}

}
