package ch06.inheritance;

public class FAccumulator {		//계산, 누적

	private int initValue;
	public static int totValue;
	
	protected FAccumulator() { }
	
	protected FAccumulator(int initValue) {
		this.initValue=initValue;		
	}	
	
	protected void setAccumulator
									(int money) {
		if(money < 0) return;
		this.initValue += money;
	}
	
	protected int getAccumulator() {
		return initValue;
	}	
	
	protected int getTotal() {
		this.totValue += initValue; // 개인별 총 금액을 한번만 누적해줌
		return totValue;
	}
	

}
