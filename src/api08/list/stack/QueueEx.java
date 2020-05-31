package api08.list.stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<>(); // LinkedList<Interger> queue = new 
		queue.offer(10);		// FIFO
		queue.offer(20);		// 
		queue.offer(30);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll() + "\t" + queue.size());
		}
		System.out.println();
		
		LinkedList<Integer> lk = new LinkedList<Integer>();
		lk.offer(77);
		lk.offer(88);
		lk.offer(99);
		lk.offer(100);
		System.out.println(lk.getFirst());
		System.out.println(lk.getLast());
		
		lk.addFirst(1);
		lk.addLast(2);
		System.out.println(lk.toString());
		
		lk.removeFirst(); //첫번째것 삭제
		lk.removeLast();
		System.out.println(lk.toString());
		
	}
}
