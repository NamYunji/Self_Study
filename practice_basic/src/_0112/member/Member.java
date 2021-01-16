package _0112.member;

public abstract class Member {
	
	private int age;

	public Member(int age) {
		super();
		this.age = age;
	}
	

	public int getAge() {
		return age;
	}
	
	public abstract int getPayment();

}
