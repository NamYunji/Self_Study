package _0121.exceptionTest;
/*
 * customException- CheckedException으로 만듦

test1
CustomException 발생시킨후 try~catch

test2
CustomException 발생시킨후 main에서 처리
 */
public class ExceptionTest {
	
	public static void main(String[] args) {
		ExceptionTest et = new ExceptionTest();
		et.test1();
		try {
			et.test2();
		} catch (MyException e) {
			System.out.println("Test2 에러발생!");
		}
	}

	public void test2() throws MyException {
		throw new MyException();
	}

	private void test1() {
		try {
			throw new MyException();			
		} catch (Exception e) {
			System.out.println("Test1 에러발생!");
		}
		
	}

}
