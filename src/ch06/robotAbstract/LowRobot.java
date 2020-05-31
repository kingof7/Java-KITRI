package ch06.robotAbstract;

public class LowRobot extends Robot{
	
	public LowRobot() { }
	
	public LowRobot(String kind) {
		super.kind = kind;
	}
	
	@Override
	protected void actionFly() {
		System.out.println("날 수 없습니다.");
	}

	@Override
	protected void actionMisile() {
		System.out.println("미사일을 쏠 수 없습니다.");		
	}

	@Override
	protected void hasSword() {
		System.out.println("검이 없습니다.");		
	}
}
