package _0112.member;

public class MemberTest {
	public static void main(String[] args) {
		
		Member[] m = new Member[4];
		m[0] = new HourlyMember(22, 2);
		m[1] = new HourlyMember(33, 3);
		m[2] = new RegularMember(44);
		m[3] = new RegularMember(55);
		
		double sum1 = 0.0;
		for (int i = 0; i < m.length; i++) {
			sum1 += m[i].getAge();
		}
		
		int sum2 = 0;
		for (int i = 0; i < m.length; i++) {
			sum2 += m[i].getPayment();
		}
		
		System.out.println("나이평균 = " + (sum1/m.length));
		System.out.println("회피 합 = " + sum2);
		
		
	}

}
