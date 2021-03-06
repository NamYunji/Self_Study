package _0106.object.bankAccount;

/**
 * - BankAccount 클래스 - 은행계좌를 나타내는 클래스 필드 : 계좌번호 예금주명(문자열) 잔액 메소드 : 계좌번호, 예금주명,
 * 잔액을 매개변수로 받아 초기화하는 constructor - 잔액이 음수이면 0으로 초기화 계좌번호, 예금주명을 매개변수로 받아 초기화하는
 * constructor - 위의 constructor를 호출하여 초기화하도록 할 것 계좌번호 getter 예금주명 getter/setter
 * 잔액 getter 입금 출금 - 잔액 부족시 출금은 이루어지지 않고 오류 메시지 출력 toString() - 계좌번호, 예금주명, 잔액을
 * 문자열로 리턴
 * 
 * 송금 - 다른 은행계좌 객체와 송금액을 매개변수로 받아 내 계좌로부터 다른 계좌로 송금 내 계좌의 잔액 부족시 송금은 이루어지지 않고 오류
 * 메시지 출력
 ** 
 * 위의 메소드들에서 오류 메시지 출력를 제외하고는 출력문을 두지 말 것
 */
public class BankAccount {

	private int accountNum;
	private String name;
	private int balance = 0;

	public BankAccount(int accountNum, String name, int balance) {
		super();
		this.accountNum = accountNum;
		this.name = name;
		this.balance = balance;
		if (balance < 0)
			balance = 0;
	}

	public BankAccount(int accountNum, String name) {
		super();
		this.accountNum = accountNum;
		this.name = name;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int plusmoney) {
		balance += plusmoney;
	}

	// 출금 - 잔액 부족시 출금은 이루어지지 않고 오류 메시지 출력
	public void withdraw(int minusmoney) {
		if (minusmoney > balance)
			System.out.println("잔액이 부족합니다");
		else
			balance -= minusmoney;
	}

	// 송금 - 다른 은행계좌 객체와 송금액을 매개변수로 받아 내 계좌로부터 다른 계좌로 송금
	// 내 계좌의 잔액 부족시 송금은 이루어지지 않고 오류 메시지 출력
	public void remit(BankAccount other, int remitmoney) {
		if (remitmoney > balance)
			System.out.println("잔액이 부족합니다.");
		else{
			this.balance -= remitmoney;
			//다른계좌에 입금
			other.balance += remitmoney;
		}
	}

	// toString() - 계좌번호, 예금주명, 잔액을 문자열로 리턴
	@Override
	public String toString() {
		return "BankAccount [accountNum=" + accountNum + ", name=" + name + ", balance=" + balance + "]";
	}

}
