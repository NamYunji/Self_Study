package _0102.array.phoneNum;

import java.util.Scanner;

/*
 * 사용자의 전화번호를 입력받고, 13자리의 문자형배열에 저장한후,
 * 가운데 4자리를 *으로 가리기
 * 단, 원본 배열값은 변경 없이 배열 복사본으로 변경하세요
 * 
 * 힌트) 복사방법
 * - for문이용 1:1 대입
 * System.arraycopy() 메소드 이용
 * clone() 메소드 이용
 */

public class PhoneNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 전화번호를 입력받음
		System.out.println("전화번호를 입력하세요\n(예시 : 010-1234-5678)");
		// 입력받은 번호를 String형식의 phNum 변수에 담아줌
		String phNum = scanner.nextLine();
		// phNum변수 속 문자열들은 charAt을 이용하여 하나하나 쪼개서 배열에 담아줌
		char[] arr1 = new char[13];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = phNum.charAt(i);
		}

		// *처리를 위한 배열을 하나 복사해줌
		char[] arr2 = arr1.clone();
		// 가운데 부분만 *으로 수정해줌
		for (int i = 4; i < 8; i++) {
			arr2[i] = '*';
		}

		//원본 전화번호 확인 출력
		System.out.println("원본 전화번호를 확인하세요");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		// 수정된 arr2를 출력
		System.out.println();
		System.out.println("전화번호를 확인하세요");
		for (int j = 0; j < arr2.length; j++) {
			System.out.print(arr2[j]);
		}

	}

}
