package thread07.Synchronized;

public class Calculator {
	private int  memory;
	
	public int getMemory() {
		return memory;
	}
	
	// 동기화 메소드
	public synchronized void setMemory(int memory) { // 임계 영역 : 단 하나의 스레드만 실행.
		this.memory = memory;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + memory);
	}
	
}

