package _0115.television;

import java.util.Arrays;

public class TelevisionTest {
	public static void main(String[] args) {
		Television[] arr = new Television[3];
		arr[0] = new Television(7);
		arr[1] = new Television(9);
		arr[2] = new Television(11);


		System.out.println("------------");
		
		//arr객체의 주소값으로 출력됨
		//찐주소값
		for (int a = 0; a < arr.length; a++) {
			System.out.println(arr);
		}
		
		/////////////////////////////
		//object의 toString표현방식 
		//내가 override하면 마음대로 표현가능
		
		//toString이 생략되어있음
		//toString을 override하지 않으면, object클래스의 toString의 이상한 방식대로 표현됨
		System.out.println("------------");		
		for (int a = 0; a < arr.length; a++) {
		System.out.println(arr[a]);
	}
		System.out.println("------------");		
		for (int a = 0; a < arr.length; a++) {
			System.out.println(arr[a].toString());
		}

		///////////////////////////////
		//남이 이미 만들어준 배열표현방식
		//parameter가 배열자체라서 for문 이용하지 않음
		System.out.println("------------");			
		//한줄로 나옴
		System.out.println(Arrays.toString(arr));
//		
//		System.out.println("----------");
//
		
		int[] arr2 = {1, 2, 3};
			System.out.println(Arrays.toString(arr2));
	}
}

