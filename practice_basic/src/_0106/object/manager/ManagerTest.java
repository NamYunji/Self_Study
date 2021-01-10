package _0106.object.manager;

/**
- ManagerTest 클래스의 main 메소드는 다음을 수행

(1) 봉급을 1000으로 초기화 한 직원 생성
(2) 직원 봉급, 세금액을 조회하여 출력

(3) 봉급을 1000, 보너스를 500로 초기화 한 매니저 생성
(4) 매니저의 봉급, 보너스, 세금액을 조회하여 출력
 */
public class ManagerTest {
	public static void main(String[] args) {
		System.out.println("--- Employee ---");
		Employee emp = new Employee(1000);
		System.out.println("봉급 = " + emp.getSalary());
		System.out.println("세금액 = " + emp.getTax());
		
		System.out.println("--- Manager ---");
		Manager mngr = new Manager(1000, 500);
		System.out.println("봉급 = " + mngr.getSalary());
		System.out.println("보너스 = " + mngr.getBonus());
		System.out.println("세금액 = " + mngr.getTax());
	}
}
