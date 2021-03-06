package _0110.bankAccount;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		NormalAccount acc1 = new NormalAccount(11, 1000);
		NormalAccount acc2 = new NormalAccount(22);
		MinusAccount acc3= new MinusAccount(33, 1000, 500);
		MinusAccount acc4 = new MinusAccount(44, 500);
		
		System.out.println("--- 최대 출금가능액 ---");
		System.out.println("acc1 = " + acc1.getBalance() + "\n" + "acc2 = " +  acc2.getBalance() + "\n" +
				"acc3 = " + (acc3.getLimit() + acc3.getBalance()) + "\n" + "acc4 = " + (acc4.getLimit() + acc4.getBalance()));
		System.out.println("--- 출금액 입력 ---");
		Scanner sc = new Scanner(System.in);
		int withdraw = sc.nextInt();
		acc1.withdraw(withdraw);
		acc2.withdraw(withdraw);
		acc3.withdraw(withdraw);
		acc4.withdraw(withdraw);
		System.out.println("--- 입금액 입력 ---");
		int deposit = sc.nextInt();
		acc1.deposit(deposit);
		acc2.deposit(deposit);
		acc3.deposit(deposit);
		acc4.deposit(deposit);
		System.out.println("--- 최대 출금가능액 ---");
		System.out.println("acc1 = " + acc1.getBalance() + "\n" + "acc2 = " +  acc2.getBalance() + "\n" +
				"acc3 = " + (acc3.getLimit() + acc3.getBalance()) + "\n" + "acc4 = " + (acc4.getLimit() + acc4.getBalance()));		
	}
}
