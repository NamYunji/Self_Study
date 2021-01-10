package _0107_inherit.manager;

import _0106.object.manager.Manager;

/**
- ManagerTest 클래스의 main 메소드는 다음을 수행

(1) 봉급을 1000으로 초기화 한 직원 생성
(2) 직원 봉급, 세금액을 조회하여 출력

(3) 봉급을 1000, 보너스를 500로 초기화 한 매니저 생성
(4) 매니저의 봉급, 보너스, 세금액을 조회하여 출력
 */
public class ManagerTest {
	public static void main(String[] args) {
		Employee empl = new Employee(1000);
		System.out.println(empl.getSalary() + " " + empl.getTax());
		
		Manager mng = new Manager(1000, 500);
		System.out.println(mng.getSalary() + " " +  mng.getBonus() + " " +  mng.getTax());
		
	}

}
