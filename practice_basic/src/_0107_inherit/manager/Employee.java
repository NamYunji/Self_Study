package _0107_inherit.manager;
/**
- Employee 클래스
  필드: 봉급(salary)
  메소드:
     봉급의 getter/setter
     getTax - 세금액(봉급의 10%)을 리턴
     봉급을 매개변수로 받아 초기화 하는 생성자
 */
public class Employee {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getTax() {
		int tax = (int)(salary*0.1);
		return tax;
	}

	public Employee(int salary) {
		super();
		this.salary = salary;
	}
	
	
	
	
	
	
	

}
