package _0107_polymorphism.student_;

/**
- StudentTest 클래스의 main 메소드는 다음을 수행

(1) 학번 11, 학점 1.5로 초기화한 학부생을 생성
(2) 학번 222, 학점 1.5로 초기화한 대학원생을 생성

(3) 학부생의 학번, 학점, 학사경고 여부를 조회하여 출력
(4) 대학원생의 학번, 학점, 학사경고 여부를 조회하여 출력
 */
public class StudentTest_ {

	public static void main(String[] args) {

		UndergraduateStudent_ udrGrad = new UndergraduateStudent_(11, 1.5);
		GraduateStduent_ grad = new GraduateStduent_(222, 1.5);

		System.out.println("학부생의 학번은 " + udrGrad.getStdtNum() + "\n학점은 " + udrGrad.getGrade());
		if (udrGrad.warning() == true) {
			System.out.println("당신은 학사경고 대상자입니다.");
		} else
			System.out.println("수고하셨습니다.");

		System.out.println("대학원생의 학번은 " + grad.getStdtNum() + "\n학점은 " + grad.getGrade());
		if (grad.warning() == true) {
			System.out.println("당신은 학사경고 대상자입니다.");
		} else
			System.out.println("수고하셨습니다.");
	}

}
