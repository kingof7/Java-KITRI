package ch06.phoneinterface;

public interface Phone { //모두 오버라이딩 해야함, 내용이 있는 메서드가 들어가면 안된다
	
	//송수신 
	public void callSend();
	//데이터 전송방식
	public void canData();
	//리모콘 기능
	public void tvRemote();
	
}
