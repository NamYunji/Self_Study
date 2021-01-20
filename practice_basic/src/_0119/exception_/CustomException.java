package _0119.exception_;

public class CustomException {
	
	public static void main(String[] args) {
		CustomException ce = new CustomException();
		ce.test1();
		try {
			ce.test2();
		} catch (YunjiException e) {
			System.out.println("test2 에러발생!");
		}
	}

	//에러발생시켜서 try~catch로 직접 처리
	private void test1() {
		try {
			throw new YunjiException();			
		} catch (Exception e) {
			System.out.println("test1 에러발생!");
		}
	}

	//에러발생시켜서 throws로 던져서 main에서 처리
	private void test2() throws YunjiException{
		throw new YunjiException();
		
	}


}
