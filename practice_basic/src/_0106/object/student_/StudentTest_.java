package _0106.object.student_;

import java.util.Scanner;

/**
- StudentTest 클래스의 main 메소드에서 다음을 수행



 */
public class StudentTest_ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		(1) 학생 객체를 하나 생성(s1이라고 하자)
//		(2) 사용자로부터 입력받은 값으로 s1의 학번, 이름, 성적을 지정 - 반드시 학번, 이름, 성적 순으로 입력받을 것
		Student_ s1 = new Student_();
		System.out.println("s1의 학번, 이름, 성적을 입력해주세요");
		s1.setStdtNum(scanner.nextInt());
		s1.setName(scanner.next());
		s1.setScore(scanner.nextDouble());
		
//		(3) 학생 객체를 하나 더 생성(s2라고 하자)
//		(4) 사용자로부터 입력받은 값으로 s2의 학번, 이름, 성적을 지정 - 반드시 학번, 이름, 성적 순으로 입력받을 것
		Student_ s2 = new Student_();
		System.out.println("s2의 학번, 이름, 성적을 입력해주세요");
		s2.setStdtNum(scanner.nextInt());
		scanner.nextLine();
		s2.setName(scanner.nextLine());
		s2.setScore(scanner.nextDouble());
		
//		(5) s1과 s2의 학번 중 앞선 학번(고학년) 출력
//		(6) s1과 s2의 이름 중 사전적으로 앞선 이름 출력
//		(7) s1과 s2의 성적 중 높은 성적 출력
		
		if(s1.getStdtNum() < s2.getStdtNum())
			System.out.println("s1이 고학번입니다");
		else
			System.out.println("s2가 고학번입니다");
				
		if (s1.getName().compareTo(s2.getName()) < 0) 
			System.out.println("s1이 사전적으로 앞섭니다");
		
		else
			System.out.println("s2가 사전적으로 앞섭니다");
		
		
		if(s1.getScore() > s2.getScore()) {
			System.out.println("s1이 성적이 더 높습니다");
		}
		else
			System.out.println("s2가 성적이 더 높습니다");
		
//		(8) 기준성적을 1.5로 s1의 합격여부를 조회하여 합격/불합격 출력
//		(9) 기준성적을 1.5로 s2의 합격여부를 조회하여 합격/불합격 출력
		System.out.println("기준점수를 입력하세요");
		double a = scanner.nextDouble();
		
		if(s1.pNp(a))
			System.out.println("합격");
		else
			System.out.println("불합격");
	
		if(s2.pNp(a))
			System.out.println("합격");
		else
			System.out.println("불합격");
	}

}
