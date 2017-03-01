package chainofresp;

public abstract class Leader {
	protected String name;
	//上一位领导
	protected Leader nextLeader;
	public Leader(String name) {
		super();
		this.name = name;
	}
	
	public void setLeader(Leader leader){
		nextLeader = leader;
	}
	
	//审批操作
	public abstract void handleRequest(Person p);
}
