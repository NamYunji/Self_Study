package _0107_polymorphism.student;

/**
- GraduateStudent 클래스 - Student 클래스를 상속
  메소드:
     학번과 학점을 매개변수로 받아 초기화하는 생성자
     기타 꼭 필요한 메소드
 */
public class GraduateStudent extends Student{

	public GraduateStudent(int stdtIDNum, double grade) {
		super(stdtIDNum, grade);
	}

	@Override
		public boolean warning() {
		if (getGrade() >= 1.5 && getGrade() < 3.0) {
			return true;
		}
		else
			return false;
		}



	
	
	

}
