package api08.list.stack;

import java.util.Stack;


public class StackEx01 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop()); 		//30
		System.out.println(stack.pop()); 		//20
		System.out.println(stack.pop()); 		//10
		//System.out.println(stack.pop()); 		//ERROR : pointer underflow
		
		Stack<String> strStack = new Stack<String>();
		strStack.push("사과");
		strStack.push("배");
		strStack.push("바나나");
		
		while(!stack.isEmpty()) { //비어있지않으면
			System.out.println(strStack.pop()); //계속뺀다
		}
		// System.out.println(strStack.pop()); ERROR
		
		


	}

}
