package _0124.abstract_;
//* 학생은 학부생과 대학원생으로 구분한다.
//* 모든 학생은 학번과 학점 속성을 가지며, 학점이 일정 기준에 미치지 못하면 학사경고이다.
//* 학부생은 학점 1.5 미만이면 학사경고이고, 대학원생은 학점 1.5 이상 3.0 미만이면 학사경고이다.
//
//- UnderGraduateStudent 클래스 - Student 클래스를 상속
//메소드:
// 학번과 학점을 매개변수로 받아 초기화하는 생성자
// 기타 꼭 필요한 메소드
//
public class UndergraduateStudent extends Student{


	public UndergraduateStudent(int stdtNo, double grade) {
		super(stdtNo, grade);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean warning() {
		if (this.getGrade() < 1.5)
		return true;
		else
			return false;
	}
	
}
