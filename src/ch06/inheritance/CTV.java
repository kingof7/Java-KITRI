package ch06.inheritance;

public class CTV {
	protected static int su;
	protected boolean power;		//전원상태
	protected int channel;			    //채널
	
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void channelUP() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
