package ch06.robotAbstract;

public class SuperRobot extends Robot{
	
	public SuperRobot() { }
	
	public SuperRobot(String kind) {
		super.kind = kind;
	}
	
	@Override
	protected void actionFly() {
		System.out.println("날 수 있습니다.");
	}

	@Override
	protected void actionMisile() {
		System.out.println("미사일을 쏠 수 있습니다.");		
	}

	@Override
	protected void hasSword() {
		System.out.println("레이저검이 있습니다.");		
	}
}
