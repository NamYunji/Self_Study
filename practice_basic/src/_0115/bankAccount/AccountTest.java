package _0115.bankAccount;

import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		BankAccount[] ba = new BankAccount[4];
		ba[0] = new NormalAccount(11, 1000);
		ba[1] = new NormalAccount(22);
		ba[2] = new MinusAccount(33, 1000, 500);
		ba[3] = new MinusAccount(44, 500);
		
		
		System.out.println("최대출금가능액");
		int i = 1;
		for (BankAccount b : ba) {
			if (b instanceof NormalAccount) {
				System.out.println("acc" + i++ + "=" + b.getBalance());
			}
			else if (b instanceof MinusAccount) {
				MinusAccount bb = (MinusAccount)b;
				System.out.println("acc" + i++ + "=" + (bb.getBalance() + bb.getLimit()));
			}
		}
		System.out.print("\n출금액 입력 : ");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		for (BankAccount aw : ba) {
			aw.withdraw(money);
		}
		
		System.out.print("\n입금액 입력 : ");
		int money2 = scanner.nextInt();
		for (BankAccount ad : ba) {
			ad.deposit(money2);
		}
		
		System.out.println("\n최대출금가능액");
		int i2 = 1;
		for (BankAccount b : ba) {
			if (b instanceof NormalAccount) {
				System.out.println("acc" + i2++ + "=" + b.getBalance());
			}
			else if (b instanceof MinusAccount) {
				MinusAccount bb = (MinusAccount)b;
				System.out.println("acc" + i2++ + "=" + (bb.getBalance() + bb.getLimit()));
			}
		}
		
		
	}

}
