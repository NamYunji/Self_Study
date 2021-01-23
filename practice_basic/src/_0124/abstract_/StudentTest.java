package _0124.abstract_;
//- StudentTest 클래스의 main 메소드는 다음을 수행
//
//(1) 학번 11, 학점 1.5로 초기화한 학부생을 생성
//(2) 학번 222, 학점 1.5로 초기화한 대학원생을 생성
//
//(3) 학부생의 학번, 학점, 학사경고 여부를 조회하여 출력
//(4) 대학원생의 학번, 학점, 학사경고 여부를 조회하여 출력
public class StudentTest {
	public static void main(String[] args) {
		
		Student s1 = new UndergraduateStudent(11, 1.5);
		Student s2 = new GraduateStudent(222, 1.5);
		
		System.out.println("학부생 : " + s1.getStdtNo() + ", " + s1.getGrade() + ", " + s1.warning());
		System.out.println("대학원생 : " + s2.getStdtNo() + ", " + s2.getGrade() + ", " + s2.warning());
		
	}
}
