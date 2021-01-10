package _0107_polymorphism.member;

/**
- MemberTest 클래스의 main 메소드는 다음을 수행

(1) 크기가 4인 Member 배열을 생성

(2) 다음 4명 생성하여 위의 회원 배열에 저장

시간제회원(나이 22, 사용시간 2)
시간제회원(나이 33, 사용시간 3)
정회원(나이 44)
정회원(나이 55) 

(3) 회원의 나이 평균을 구해 출력 <--- 반복문 이용할 것, 나이 리터럴 이용 금지

(4) 회원의 회비 합을 구해 출력 <--- 반복문 이용할 것, 회비 리터럴 이용 금지
 */
public class MemberTest {
	public static void main(String[] args) {

		Member[] member = new Member[4];
		member[0] = new HourlyMember(22, 2);
		member[1] = new HourlyMember(33, 3);
		member[2] = new RegularMember(44);
		member[3] = new RegularMember(55);
		
		int sum = 0;
		for (int i = 0; i < member.length; i++) {
			sum += member[i].getAge();
		}
		
		System.out.println("회원의 평균나이는 " + sum/member.length);
		
		int paymentSum = 0;
		for (int i = 0; i < member.length; i++) {
			paymentSum += member[i].getPayment();
		}
		System.out.println("회원의 회비합계는 " + paymentSum);
		
	}

}
