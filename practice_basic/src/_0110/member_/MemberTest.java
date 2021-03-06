package _0110.member_;

public class MemberTest {
	public static void main(String[] args) {
		Member[] m = new Member[4];
		m[0] = new HourlyMember(22, 2);
		m[1] = new HourlyMember(33, 3);
		m[2] = new RegularMember(44);
		m[3] = new RegularMember(55);
		
		double sum1 = 0;
		for (int i = 0; i < m.length; i++) {
			sum1 += m[i].getAge();
		}
		
		System.out.println("나이 평균 : " + sum1/m.length);
		
		int sum2 = 0;
		for (int i = 0; i < m.length; i++) {
			sum2 += m[i].getPayment();
		}
		System.out.println("회비 합 : " + sum2);
		
	}

}
