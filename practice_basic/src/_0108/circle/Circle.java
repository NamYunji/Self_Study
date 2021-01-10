package _0108.circle;
/**
Circle 클래스를 정의하고 이를 사용하는 프로그램을 작성하시오.

- Circle 클래스
  private 필드:
        반지름(radius) - 정수형
  public 메소드: 
 생성자 - 반지름을 매개변수로 받아 초기화 
        toString(), equals()를 오버라이드 ******
 */
public class Circle {
	
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Circle))
		return false;
		if(this.radius == ((Circle)obj).radius)
				return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "반지름 : " + radius;
	}
	
	

}
