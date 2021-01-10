package _0110.bankAccount;

public class NormalAccount extends BankAccount{

	public NormalAccount(int id, int balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}

	public NormalAccount(int id) {
		super(id, 0);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withdraw(int amount) {
		if(getBalance() < amount)
			System.out.println("계좌 " + getId() + ": "+ "잔액부족으로 출금 실패");
		else
			super.withdraw(amount);
			
	}


	
	
	
	

}
