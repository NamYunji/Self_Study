package _0112.bankAccount;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
//		BankAccount[] arr = new BankAccount[4];
//		arr[0] = new NormalAccount(11, 1000);
//		arr[1] = new NormalAccount(22);
//		arr[2] = new MinusAccount(33, 1000, 500);
//		arr[3] = new MinusAccount(44, 500);
		
		BankAccount[] arr = new BankAccount[4];
		NormalAccount a1 = new NormalAccount(11, 1000);
		NormalAccount a2 = new NormalAccount(22);
		MinusAccount a3 = new MinusAccount(33, 1000, 500);
		MinusAccount a4 = new MinusAccount(44, 500);
		
		System.out.println("최대 출금가능액");
		System.out.println("acc" + 1 + " = " + a1.getBalance());
		System.out.println("acc" + 2 + " = " + a2.getBalance());
		System.out.println("acc" + 3 + " = " + (a3.getBalance() + a3.getLimit()));
		System.out.println("acc" + 4 + " = " + (a2.getBalance()+ a4.getLimit()));
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("출금액 입력 : ");
		int money1 = scanner.nextInt();
		a1.withdraw(money1);
		a2.withdraw(money1);
		a3.withdraw(money1);
		a4.withdraw(money1);

	
		System.out.print("입금액 입력 : ");
		int money2 = scanner.nextInt();
		a1.deposit(money2);
		a2.deposit(money2);
		a3.deposit(money2);
		a4.deposit(money2);
		
		
//		System.out.println("최대 출금가능액");
//		for (BankAccount b : arr) {
//			if(b instanceof NormalAccount)
//				System.out.println("최대출금액 : " + b.getBalance());
//			else if(b instanceof MinusAccount)
//				System.out.println("최대출금액 : " + (b.getBalance()+((MinusAccount)b).getLimit()));
//		}
	
		System.out.println("acc" + 1 + " = " + a1.getBalance());
		System.out.println("acc" + 2 + " = " + a2.getBalance());
		System.out.println("acc" + 3 + " = " + (a3.getBalance() + a3.getLimit()));
		System.out.println("acc" + 4 + " = " + (a4.getBalance()+ a4.getLimit()));
	}
}
