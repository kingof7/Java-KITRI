package thread02.Demon;

class ThreadPriority {

	public static void main(String args[]) {

		A th1 = new A();
		B th2 = new B();

		th1.setPriority(4); // main에서 생성했기에 defalut 우선순위 5
		th2.setPriority(7);

		System.out.println("Priority of th1(-) : " + th1.getPriority() );
		System.out.println("Priority of th2(|) : " + th2.getPriority() );

		th1.start();
		th2.start();
	}
}

class A extends Thread {

	public void run() {

		for(int i=0; i < 300; i++) {

			System.out.print("-");

			for(int x=0; x < 10000000; x++);
		}
	}
}

class B extends Thread {

	public void run() {

		for(int i=0; i < 300; i++) {

			System.out.print("|");

			for(int x=0; x < 10000000; x++);
		}
	}
}

//출처: https://devbox.tistory.com/entry/Java-쓰레드의-우선순위 [장인개발자를 꿈꾸는 :: 기록하는 공간]