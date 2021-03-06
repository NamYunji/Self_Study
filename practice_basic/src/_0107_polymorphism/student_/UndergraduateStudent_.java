package _0107_polymorphism.student_;

/**
- UnderGraduateStudent 클래스 - Student 클래스를 상속
  메소드:
     학번과 학점을 매개변수로 받아 초기화하는 생성자
     기타 꼭 필요한 메소드
 */
public class UndergraduateStudent_ extends Student_ {

	public UndergraduateStudent_(int stdtNum, double grade) {
		super(stdtNum, grade);
	}

	@Override
	boolean warning() {
		if (getGrade() < 1.5) {
			return true;
		} else
			return false;
	}

}
