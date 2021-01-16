package _0112.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	//(1) y에 0 입력시 result = 0
	//(2) x나 y에 정수 아닌 값(예를 들어 aa) 입력시 result = 1

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x, y, result;

		try {
			System.out.print("정수 x 입력: ");
			x = scan.nextInt();
			System.out.print("정수 y 입력: ");
			y = scan.nextInt();
			result = x / y;
			
		} catch (ArithmeticException e) {
			result = 0;
		} catch (InputMismatchException e) {
			result = 1;
		}
		System.out.println("result = " + result);
	}
}


