package _0115.bankAccount;

public class NormalAccount extends BankAccount{

	public NormalAccount(int id) {
		super(id, 0);
	}

	public NormalAccount(int id, int balance) {
		super(id, balance);
	}
	
	@Override
	public void withdraw(int amount) {
		if (getBalance() < amount) {
			System.out.println("계좌" + id + ": 잔액 부족으로 출금 실패");
		}
		else
			super.withdraw(amount);
	}
	
	

}
