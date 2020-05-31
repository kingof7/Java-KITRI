package api08.list.stack;

import java.util.Stack;

public class StackEx02 {

	public static void main(String[] args) {
		Stack<Coin> coin = new Stack<Coin>();
		coin.push(new Coin(100)); //push할때는 객체 따로 필요없다
		coin.push(new Coin(50));
		coin.push(new Coin(70));
		coin.push(new Coin(60));
		
		while(!coin.isEmpty()) {
			Coin c = coin.pop(); //뽑을때는 객체를 따로만들어서 값을 담아줘야함
			System.out.println(c.getValue());
		}
		
	}

}
