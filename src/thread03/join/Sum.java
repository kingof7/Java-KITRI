package thread03.join;

public class Sum extends Thread{
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			this.sum += i;
			
			try {
				sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Sum 합:" + getSum());
	
	}
}
