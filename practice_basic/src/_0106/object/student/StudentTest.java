package _0106.object.student;

/**
 * - StudentTest 클래스의 main 메소드에서 다음을 수행 (1) 학생 객체를 생성 (2) 학생 학번을 적절히 지정 (3) 학생
 * 객체의 학번을 조회하여 출력
 * 
 * 꼭 필요한 경우 이외에는 필드를 private로 선언할 것(이어지는 모든 과제에 해당함)
 */
public class StudentTest {
	public static void main(String[] args) {
		//학생 객체 생성
		Student stdt = new Student();
		//학번 세팅
		stdt.setStdtNum(20160085);
		//지정해준 학번을 불러와서 출력
		System.out.println("학번 = " + stdt.getStdtNum());
	}

}
