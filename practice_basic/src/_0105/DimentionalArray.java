package _0105;

public class DimentionalArray {

	public static void main(String[] args) {

		DimentionalArray da = new DimentionalArray();
//		da.test1();
		da.test2();

	}

	// 구구단을 외자 + continue
	private void test2() {
		for (int i = 2; i < 10; i++) {
			System.out.println("---" + i + "단---");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
				//밑에 것은 실행하지 않고 바로 증감식으로 돌아간다
				//특정 조건이 있는 경우 (ex. if) 쓰임
				continue;
				//System.out.println("나는 바보");
			}
		}
	}

	// 구구단을 외자 + break
	private void test1() {
		for (int i = 2; i < 10; i++) {
			System.out.println("---" + i + "단---");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
				break;
			}
			break;
		}
	}
	
	
}
