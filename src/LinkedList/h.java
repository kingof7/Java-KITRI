package LinkedList;

import java.util.LinkedList;

public class h {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("호랑이");
		ll.add("사자");
		ll.add("곰");
		ll.add("토끼");
		ll.add("고냥이");
		
		ll.set(1, "dog");
		//호랑이 dog 곰 토끼 고냥이
		ll.remove(2);
		//호랑이 dog 토끼 고냥이
		ll.addFirst("Cat");
		//Cat 호랑이 dog 토끼 고냥이
		ll.addLast("Frog");
		//Cat 호랑이 dog 토끼 고냥이 Frog
		ll.set(0, "Monkey"); // cat->monkey
		//Monkey 호랑이 dog 토끼 고냥이 Frog		
		System.out.println(ll.size());
		//6
		System.out.println(ll.clone());
		
		for(String a : ll)
			System.out.print(a +" ");
		
	}
}