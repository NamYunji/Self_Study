package _0119.exception_;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest t = new ExceptionTest();
        
//        t.test1();
//        try {
//        	t.test2();
//		} catch (Exception e) {
//			System.out.println("에러발생! 0으로 나눌수 없음!!");
//		}
//        t.test3();
        try {
        	t.test4();			
		} catch (Exception e) {
			System.out.println("에러발생!");
		}
    }

    private void test4() throws Exception{
    	throw new Exception();
	}

	private void test3() {
    	try {
    		throw new Exception();			
		} catch (Exception e) {
			System.out.println("어쩌구 에러 발생!");
		}
	}

	private void test2() throws ArithmeticException{
        int a=10;
        int b=0;
        System.out.println(a/b);
	}

	private void test1() {

        int a=10;
        int b=0;
        
        try {
            System.out.println(a/b); //Unchecked Exception 발생 
        } catch (Exception e) {
            System.out.println("에러발생!");
//            return;
        }finally {
            System.out.println("Finally 블럭 작동!");
        }
        System.out.println("test1 메서드 끝!");
    }
}
