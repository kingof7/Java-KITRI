package api11.MVC.Bank;

import java.util.Scanner;

/**
 * @author : 이종화
 * @date : 2020. 5. 15.
 * @description : MVC : Model (Oracle, MSSQL, MySQL / RDBMS)
 */
public class AccountView {

	public static void main(String[] args) {
		
		AccountManager manager = new AccountManager();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			printMenu();
			System.out.println("선택: ");
		
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				manager.makeAccount();
				break;
			case 2: 
				manager.deposit();
				break;
			case 3:
				manager.withdraw();
				break;
			case 4: 
				manager.inquire();
				break;			
			case 5: 
				manager.disp();
				break;
			case 6: 
				System.out.println("종료합니다."); 
				sc.close(); 
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}				
	}
	
	public static void printMenu() {
			System.out.println("Menu---------------");
			System.out.println("1.계좌개설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.잔액조회");
			System.out.println("5.전체출력");
			System.out.println("6.프로그램종료");
			System.out.println();
	}	
		
}
