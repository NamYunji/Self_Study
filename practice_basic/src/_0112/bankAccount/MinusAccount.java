package _0112.bankAccount;

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
	
	
	public int getLimit() {
		return limit;
	}
	

	@Override
	public void withdraw(int amount) {
		if (amount > (getBalance() + getLimit())) {
			System.out.println("계좌" + id + ": 한도초과로 출금실패");
		} else
			super.withdraw(amount);
	}

	

}
