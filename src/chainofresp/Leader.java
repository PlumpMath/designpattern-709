package chainofresp;

public abstract class Leader {
	protected String name;
	//��һλ�쵼
	protected Leader nextLeader;
	public Leader(String name) {
		super();
		this.name = name;
	}
	
	public void setLeader(Leader leader){
		nextLeader = leader;
	}
	
	//��������
	public abstract void handleRequest(Person p);
}
