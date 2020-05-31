package thread08.Notify;

import java.util.Stack;

public class AutoMachine {
	private Stack<String> store = new Stack<String>();
	private Producer pd = new Producer(this);
	
	public synchronized void setDrink(String drink) {
		store.push(drink);
		System.out.println("음료 1개 채움");
		if (!store.isEmpty()) {
			pd.run();
			notify();				// 음료수가 채워지면 getDrink()를 다시 깨운다.
		}
	}
	
	public synchronized String getDrink() {
		
		if (store.isEmpty()) {
			try {
				wait();				// 음료수가 비워져 있으면 메소드를 잠시 멈춘다.
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		return store.pop();
	}
}
