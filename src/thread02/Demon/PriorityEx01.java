package thread02.Demon;

/**
 * @author : 이종화
 * @date : 2020. 5. 20.
 * @description : 동시성(Concurrency) : 하나의 코어에서 멀티 스레드가 번갈아 가며 실행하는 것
						 							  				어떤 순서에 의해 동시성으로 실행할 것인가를 결정하는 것은
						 											스케쥴링(CPU)이라고 한다.						   <core>
 *							  병렬성(Parallelism) : 멀티 코어에서 멀티 작업을 동시에 실행하는 것  ㅁ ㅁ ㅁ ㅁ  →병렬성
 *																																	 ㅁ ㅁ ㅁ ㅁ  ↓ 동시성
 */
class Example extends Thread {
	
	@Override
	public void run() {
		System.out.println(getName());
		for(int i=0;i<2000000000;i++) {}
		
	}
}

public class PriorityEx01 {
	public static void main(String[] args) throws InterruptedException {
		//쿼드 코어일 경우, 스레드가 병렬성으로 실행될 수 있기 때문에, 4개 이하의 스레드를
		//실행할 경우 우선순위 영향을 크게 받지 못한다. 그러므로 4개 이상으로 한다.
		
		for(int i=1;i<=10;i++) {
			Example exp = new Example();
			exp.setName("thread:" + i);
			
			if(i == 5) { //우선순위 1위
				exp.setPriority(Thread.MAX_PRIORITY);    // 10~1값을 가지고 있음		
			}
			
			if(i == 3) {
				exp.setPriority(Thread.MIN_PRIORITY); // 1이라고 써도됨			
			}
			
			if(i == 10) {
				exp.setPriority(5);
			}
			
			exp.start();
			Thread.sleep(1000);
			
		}		
	}
}

