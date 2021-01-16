package _0115.arrayTest;

import java.util.Scanner;

public class Lab_41 {
	public static void main(String[] args) {
		System.out.println("배열길이 입력");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("정수 다섯개 입력");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("배열 = ");                    
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
//		System.out.println(Arrays.toString(arr));
	}

}
