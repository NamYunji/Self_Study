package _0112.bankAccount;

public class NormalAccount extends BankAccount{

	public NormalAccount(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	public NormalAccount(int id, int balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withdraw(int amount) {
		if (amount > getBalance())
			System.out.println("계좌" + id + ": 잔액부족으로 출금실패");
		else
			super.withdraw(amount);
	}

}
