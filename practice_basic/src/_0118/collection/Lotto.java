package _0118.collection;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {

		Set<Integer> set = new HashSet<Integer>();

		while (true) {
			try {
				//scanner는 try문 안에 있어야 한다!
				Scanner sc = new Scanner(System.in);
				System.out.print("숫자를 입력하세요 : ");
				int num = sc.nextInt();
				set.add(num);
				System.out.println("set의 사이즈 : " + set.size() + "\n");

				if (set.size() == 6) {
					System.out.println("set의 size가 6이라서 멈춥니다.");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("숫자로 입력하세요");
			}
		}

		System.out.println("set에 저장된 값  : " + set);

		//////////////////////////////////////

		Set<Integer> lotto = new HashSet<Integer>();
		
		while(true) {
			int num = (int)(Math.random() * 45) + 1;
			lotto.add(num);
			System.out.println(num);
			if (lotto.size() == 6) {
				break;
			}
		}
	}

}
