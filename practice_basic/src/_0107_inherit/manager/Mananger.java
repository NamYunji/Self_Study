package _0107_inherit.manager;

/**
- Manager 클래스 - Employee를 상속
  필드: 보너스(bonus)
  메소드:
     보너스의 getter/setter
     봉급과 보너스를 매개변수로 받아 초기화 하는 생성자 
     getTax 오버라이드 - 매니저의 속성에 적합하게 세금액(봉급과 보너스 총액의 10%)을 리턴
 */

//상속했기 때문에, salary메소드는 보이지 않아도 자동으로 생성되어 있다
public class Mananger extends Employee{
	//필드
	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Mananger(int salary, int bonus) {
		super(salary);
		this.bonus = bonus;
	}

	@Override
	public int getTax() {
		return (int)((getBonus()+getSalary())*0.1);
	}
	
	
	

}
