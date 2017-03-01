package chainofresp;

public class Teacher extends Leader {

	public Teacher(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Person p) {
		if(p.getDays()<=3){
			System.out.print("老师:" + name + " 审批通过 " + p.getName() + "的"+ p.getDays() + "天假期~");
		}else{
			nextLeader.handleRequest(p);
		}
	}

}
