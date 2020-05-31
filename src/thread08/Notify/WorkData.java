package thread08.Notify;

public class WorkData {
	public synchronized void method() {		// 동기화 함수, 출력
		System.out.println(Thread.currentThread().getName() + " : method() 작업실행");
		notify();
		try {
			wait();		//일시 정지. notify() 메소드로 일시 정지를 풀 수 있다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void sub() {		// 동기화 함수, 입력
		System.out.println(Thread.currentThread().getName() + " : sub() 작업실행");
		notify();
		try {
			wait();		//일시 정지. notify() 메소드로 일시 정지를 풀 수 있다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
