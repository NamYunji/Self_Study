package _0107_polymorphism;
/**
다음과 같은 학사 관리를 위해 학생을 abstract class로 정의하고, 이를 상속하는 학부생, 대학원생 클래스를 정의하고 사용해보자.
* 학생은 학부생과 대학원생으로 구분한다.
* 모든 학생은 학번과 학점 속성을 가지며, 학점이 일정 기준에 미치지 못하면 학사경고이다.
* 학부생은 학점 1.5 미만이면 학사경고이고, 대학원생은 학점 1.5 이상 3.0 미만이면 학사경고이다.

- Student 클래스 <---- 아래 첨부한 코드 이용
  필드: 학번(정수형), 학점(실수형)
  메소드:
     학번과 학점을 매개변수로 받아 초기화하는 생성자
     학번 getter
     학점의 getter/setter
     warning() - 학사경고 여부를 조회(매개변수가 없고 리턴값은 boolean인 abstract method)
 */
public abstract class Student {
	
	private int stdtIDNum;
	private double grade;
	
	public Student(int stdtIDNum, double grade) {
		super();
		this.stdtIDNum = stdtIDNum;
		this.grade = grade;
	}

	public int getStdtIDNum() {
		return stdtIDNum;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	//추상메소드
	public abstract boolean warning();
	
	
	
	

}
