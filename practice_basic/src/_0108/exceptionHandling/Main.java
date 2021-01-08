package _0108.exceptionHandling;

import java.util.InputMismatchException;

//첨부한 프로그램에서 다음과 같이 예외 처리하시오.
//
//(1) y에 0 입력시 result = 0
//
//(2) x나 y에 정수 아닌 값(예를 들어 aa) 입력시 result = 1

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("lab14_2: 홍길동");
		Scanner scan = new Scanner(System.in);

		int x, y, result;

		try {
			System.out.print("정수 x 입력: ");
			x = scan.nextInt();
			System.out.print("정수 y 입력: ");
			y = scan.nextInt();
			result = x / y;
			System.out.println("result = " + result);
		} catch (ArithmeticException e) {
			result = 0;
		}
		catch (InputMismatchException e) {
			result = 1;
		}
		System.out.println("result = " + result);
	}
}
