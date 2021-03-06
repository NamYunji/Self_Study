package _0107_polymorphism.student;

/**
- StudentTest 클래스의 main 메소드는 다음을 수행

(1) 학번 11, 학점 1.5로 초기화한 학부생을 생성
(2) 학번 222, 학점 1.5로 초기화한 대학원생을 생성

(3) 학부생의 학번, 학점, 학사경고 여부를 조회하여 출력
(4) 대학원생의 학번, 학점, 학사경고 여부를 조회하여 출력
 */
public class StudentTest {
	public static void main(String[] args) {
		UnderGraduateStudent undGrad = new UnderGraduateStudent(11, 1.5);
		GraduateStudent grad = new GraduateStudent(222, 1.5);
		
		System.out.println("학번은 " + undGrad.getStdtIDNum() + "\n학점은 " + undGrad.getGrade());
		if (undGrad.warning() == true) {
			System.out.println("학사경고입니다. 열심히 공부하세요");
		}
		else
			System.out.println("열심히 공부하셨네요. 수고하셨습니다.");
		
		System.out.println("학번은 " + grad.getStdtIDNum() + "\n학점은 " + grad.getGrade());
		if (grad.warning() == true) {
			System.out.println("학사경고입니다. 열심히 공부하세요");
		}
		else
			System.out.println("열심히 공부하셨네요. 수고하셨습니다.");
	}

}
