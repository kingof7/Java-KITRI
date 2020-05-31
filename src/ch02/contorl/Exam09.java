package ch02.contorl;

/**
 * @author : 이종화
 * @date : 2020. 4. 28.
 * @description :
 */
public class Exam09 {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue; // if문제외한 가장 가까운 블록의 밖으로 빠져나감 // 반복문 바깥으로 나감
			}
			System.out.println(i);
		}
		
		for (int i = 1; i < 10; i++) {
			if (i == 5) {
				continue; // if문제외한 가장 가까운 블록의 밖으로 빠져나감 // 반복문 바깥으로 나감
			}
			System.out.println(i);
		}

	
		/*
		 * if (su == 5) { break; // if문 단독으로 사용할 수없다. (반복문이없으니) }
		 * 
		 * if (su == 5) { continue; // 반복문 시작으로 올라감 }
		 */
	}

}
