package _0115.bankAccount;

public class MinusAccount extends BankAccount{
	
	private int limit;

	public MinusAccount(int id, int balance, int limit) {
		super(id, balance);
		this.limit = limit;
	}

	public MinusAccount(int id, int limit) {
		super(id, 0);
		this.limit = limit;
	}
	
	@Override
	public void withdraw(int amount) {
		if ((getBalance() + limit) < amount) {
			System.out.println("계좌" + id + ": 잔액부족으로 출금실패");
		}
		else
		super.withdraw(amount);
	}

	public int getLimit() {
		return limit;
	}
	
	

	

	

}
