package _0106.object.bankAccount;

import java.util.Scanner;

/**
 * - BankAccountTest 클래스 - main 메소드에서 다음을 수행
 * 
 * (1) 계좌번호 1, 예금주명 kim, 잔액 9000으로 초기화한 은행계좌 생성(account1 이라고 하자) (2) 계좌번호 2,
 * 예금주명 lee로 초기화한 은행계좌 생성(account2 라고 하자)
 * 
 * (3) 사용자로부터 입금액을 입력받아 account1에 입금 (4) 사용자로부터 출금액을 입력받아 account1에서 출금
 * 
 * (5) 사용자로부터 입금액을 입력받아 account2에 입금 (6) 사용자로부터 출금액을 입력받아 account2에서 출금
 * 
 * (7) 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시 (8) 사용자로부터 송금액을 입력받아
 * account2에게 account1로 송금하도록 지시
 * 
 * (9) account2의 예금주명을 park으로 수정 (10) account2의 계좌번호, 예금주명, 잔액 출력
 * 
 * (11) account1의 계좌번호, 예금주명, 잔액 출력
 ** 
 * 사용자가 입력하는 입금액, 출금액, 송금액은 모두 양수라고 가정해도 됨
 */

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// (1) 계좌번호 1, 예금주명 kim, 잔액 9000으로 초기화한 은행계좌 생성(account1 이라고 하자)
		BankAccount ac1 = new BankAccount(1, "kim", 9000);
		// (2) 계좌번호 2, 예금주명 lee로 초기화한 은행계좌 생성(account2 라고 하자)
		BankAccount ac2 = new BankAccount(2, "lee");
		System.out.println(ac1 + "\n" + ac2);

		// (3) 사용자로부터 입금액을 입력받아 account1에 입금
		System.out.print(ac1.getName() + "에게 얼마를 입금할까요? : ");
		ac1.deposit(sc.nextInt());
		System.out.println(ac1 + "\n" + ac2);
		// (4) 사용자로부터 출금액을 입력받아 account1에서 출금
		System.out.print(ac1.getName() + "에서 얼마를 출금할까요 ? ");
		ac1.withdraw(sc.nextInt());
		System.out.println(ac1 + "\n" + ac2);
		// (5) 사용자로부터 입금액을 입력받아 account2에 입금
		System.out.print(ac2.getName() + "에게 얼마를 입금할까요? : ");
		ac2.deposit(sc.nextInt());
		System.out.println(ac1 + "\n" + ac2);
		// (6) 사용자로부터 출금액을 입력받아 account2에서 출금
		System.out.print(ac2.getName() + "에서 얼마를 출금할까요 ? ");
		ac2.withdraw(sc.nextInt());

		System.out.println();
		System.out.println("송금전 잔액 확인");
		System.out.println(ac1);
		System.out.println(ac2);

		// (7) 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
		System.out.print(ac2.getName() + "계좌에서 " + ac1.getName() + "계좌로 얼마를 보낼까요? : ");
		ac2.remit(ac1, sc.nextInt());

		System.out.println("송금전 잔액 확인");
		System.out.println(ac1);
		System.out.println(ac2);
		// (8) 사용자로부터 송금액을 입력받아 account2에게 account1로 송금하도록 지시
		System.out.print(ac2.getName() + "계좌에서 " + ac1.getName() + "계좌로 얼마를 보낼까요? : ");
		ac2.remit(ac1, sc.nextInt());

		// (9) account2의 예금주명을 park으로 수정
		System.out.println(ac2.getName() + "의 이름을 park로 수정");
		ac2.setName("park");
		// (10) account1의 계좌번호, 예금주명, 잔액 출력
		System.out.println(ac1);
		// (11) account2의 계좌번호, 예금주명, 잔액 출력
		System.out.println(ac2);
	}
}
