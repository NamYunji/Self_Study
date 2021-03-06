package _0102.array.order;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 배열의 크기로 홀수인 양의 정수를 입력 받아 배열을 만드세요
 * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하는 프로그램을 작성하세요.
 * 
 * 출력 예) 7을 입력하면
 * [1,2,3,4,3,2,1]
 */

public class Order {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("홀수인 양의 정수를 입력하시오");
		int[] arr = new int[scanner.nextInt()];
		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] = i + 1;
		}
		for (int i = arr.length / 2; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}

		System.out.println(Arrays.toString(arr));
	}
}
