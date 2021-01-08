package _0102;

/*
   - PizzaTest 클래스: main 메소드에서 다음을 수행
  (1) 피자를 하나 생성
  (2) 피자의 브랜드, 지름, 가격을 적절히 지정
  (3) 피자의 광고 문구(브랜드, 지름, 가격을 언급)를 출력
- 주의: 브랜드, 지름, 가격 출력시 리터럴을 사용하지 말고
 */

public class Object_PizzaTest {
	public static void main(String[] args) {

		// 방법1. 기본생성자 이용
		Object_Pizza pz1 = new Object_Pizza();

		pz1.setBrand("도미노");
		pz1.setDiameter(13.00);
		pz1.setPrice(13_000);

		System.out.println("--- 기본 생성자 使用  --- ");
		System.out.println(pz1.toString());

		// 방법2. parameter생성자 이용
		Object_Pizza pz2 = new Object_Pizza("도미노", 13.00, 13_000);
		System.out.println("--- parameter 생성자 使用 ---");
		System.out.println(pz2.toString());
		
		Object_Pizza pz3 = new Object_Pizza("도미노");

	}

}
