package _0104.com.oop.book.controller;

import java.util.Scanner;

import _0104.com.oop.book.model.Book;

public class BookManager {

	private Book[] bar = null;
	static Scanner scanner = new Scanner(System.in);
	private static int count = 0;

	// 초기화블럭 : book manager라는 객체가 생성될 때, 처음 한번만 실행되는 것들
	{
		bar = new Book[10];
	}

	// for문, while문 : 조건에 맞으면 실행
	// do while문 : 조건 적합 여부와 상관없이 무조건 한번은 실행
	// 7번을 누르면, 탈출 -> break를 걸어줌
	public void menu() {
		for (;;) {
			System.out.println("1. 도서 정보 추가");
			System.out.println("2. 모두 출력");
			System.out.println("7. 끝내기");
			System.out.print("입력 : ");
			int num = scanner.nextInt();
			if (num == 7) {
				System.out.println("종료");
				break;
			} else if (num == 1) {
				// bookInput 메소드 실행
				bookInput();
			} else if (num == 2) {
				// bookAllOutput 메소드 실행
				bookAllOutput();

			} else {
				System.out.println("잘못입력하셨습니다.");
			}

		}
	}

	public void bookInput() {
		System.out.println("bookInput 메소드 실행");
		String title = scanner.next();
		int price = scanner.nextInt();
		int discountRate = scanner.nextInt();
		String author = scanner.next();

		bar[count] = new Book(title, price, discountRate, author);
		count++;
	}

	public void bookAllOutput() {
		System.out.println("bookAllOutput 메소드 실행");
		for (int i = 0; i < count; i++) {
			bar[i].information();
		}
	}

}
