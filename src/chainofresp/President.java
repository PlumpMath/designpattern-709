package chainofresp;

public class President extends Leader {

	public President(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Person p) {
		if(p.getDays()<=15){
			System.out.print("校长:" + name + " 审批通过 " + p.getName() + "的"+ p.getDays() + "天假期~");
		}else{
			System.out.print("假期不可超15天");
		}
	}

}
