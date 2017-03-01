package chainofresp;

public class Dean extends Leader {

	public Dean(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Person p) {
		if(p.getDays()<=10){
			System.out.print("院长:" + name + " 审批通过 " + p.getName() + "的"+ p.getDays() + "天假期~");
		}else{
			this.nextLeader.handleRequest(p);
		}
	}

}
