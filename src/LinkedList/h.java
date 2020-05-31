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
		ll.remove(2);
		
		ll.addFirst("Cat");
		ll.addLast("Frog");
		ll.set(0, "Monkey"); // cat->monkey
				
		System.out.println(ll.size());
		System.out.println(ll.clone());
		
		for(String a : ll)
			System.out.print(a +" ");
		
	}
}