package _0112.member;

public class HourlyMember extends Member{
	
	private int hour;

	public HourlyMember(int age, int hour) {
		super(age);
		this.hour = hour;
	}

	@Override
	public int getPayment() {
		return (hour*100);
	}

	

	
	

}
