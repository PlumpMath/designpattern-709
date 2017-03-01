package chainofresp;

public class Department extends Leader {

	public Department(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Person p) {
		if(p.getDays()<=5){
			System.out.print("系主任:" + name + " 审批通过 " + p.getName() + "的"+ p.getDays() + "天假期~");
		}else{
			this.nextLeader.handleRequest(p);
		}
	}

}
