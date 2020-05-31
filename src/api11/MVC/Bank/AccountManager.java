package api11.MVC.Bank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author : 조동준
 * @Date : 2020. 5. 15.
 * @Description : db안붙었기때문에 우린 arraylist쓴다. 만약 db붙었다면 list안쓰고 바로 자료쓰는데
 */
public class AccountManager {
   private Scanner sc;
   private ArrayList<Account> list;

   public AccountManager() {
      list = new ArrayList<Account>();
      sc = new Scanner(System.in);
   }
   
   public void makeAccount() { // 계좌개설
      Account account = new Account();
      
      System.out.print("ID : "); account.setId(sc.nextInt());
      System.out.print("이름 : "); account.setName(sc.next());
      System.out.print("잔금: ");account.setBalance(sc.nextLong());

      list.add(account);

      System.out.println("계좌가 개설되었습니다.");
      System.out.println(list.toString());
   }

   public void disp() {
      for (int i = 0; i < list.size(); i++) {
         Account account = list.get(i);
         System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
      }
   }

   public void deposit() {
      System.out.println("계좌번호");
      int id = sc.nextInt();
      System.out.println("입금액");
      long money = sc.nextLong();

      for (int i = 0; i < list.size(); i++) {
         Account account = list.get(i);

         if (account.getId() == id) {
            long balance = account.getBalance();
            balance += money;
            account.setBalance(balance);
            System.out.println("입금완료되었습니다.");
            return; // id가 일치하면 입금하고 아래로 더이상 가지 않고 바로 함수 빠져나온다.
         }
      }
      System.out.println("해당계좌번호가 존재하지 않습니다.");
   }
   
   public void withdraw() {
      System.out.println("계좌번호 : ");
      int id = sc.nextInt();
      
      System.out.println("출금액 : ");
      long money = sc.nextLong();
      
      for(int i=0;i<list.size();i++) {
         Account account = list.get(i);
         
         if(account.getId()==id) {
            if(account.getBalance() < money) {
               System.out.println("잔액부족입니다.");
               return;   
            }else {
               long balance = account.getBalance();
               balance -= money;
               account.setBalance(money);
               System.out.println("출금완료했습니다.");
               return;   
            }
         }
      }
      System.out.println("해당계좌번호가 존재하지 않습니다.");
   }
   
   public void inquire() {
      System.out.println("계좌번호 : ");
      int id = sc.nextInt();
      
      for(int i=0;i<list.size();i++) {
         Account account = list.get(i);
         if(account.getId()==id) {
            System.out.println(account.getId() + "\t" + account.getName() + "\t" + account.getBalance());
            return;   //함수빠져나온다.
         }
      }
      System.out.println("해당계좌번호가 없습니다.");
   }

}