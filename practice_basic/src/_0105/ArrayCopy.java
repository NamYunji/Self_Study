package _0105;

public class ArrayCopy {

	public static void main(String[] args) {
		ArrayCopy ac = new ArrayCopy();
		ac.test1();
		ac.test2();
	}

	// 얕은복사
	private void test1() {
		System.out.println("------ 얕은 복사 -----");
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = arr1;
		// 원본값 바뀌면 복사값도 함께 바뀜
		arr1[0] = 100;

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("hashCode = " + arr1.hashCode());

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("hashCode = " + arr2.hashCode());
	}

	private void test2() {
		System.out.println("------ 깊은 복사 -----");
		//선언과 동시에 값 기록
		int[] arr1 = {1, 2, 3, 4, 5};
		//배열 크기만 할당해줌
		int[] arr2 = new int[5];
		
		
		//////////////////////////////////////////////////

		System.out.println("-- for문을 이용한 깊은 복사 --");
		
		//arr1의 배열을 arr2의 배열로 복사
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}
		
		//arr1의 0번지를 100으로 수정 -> arr1만 수정되고 arr2에는 반영되지 않음
		arr1[0] = 100;
		
		//arr1의 값 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		//arr1의 hashCode 출력
		System.out.println("hashCode = " + arr1.hashCode());
		
		//arr2의 값 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		//arr2의 hashCode 출력
		System.out.println("hashCode = " + arr2.hashCode());

		//////////////////////////////////////////////////
		
		System.out.println("-- clone메소드를 이용한 깊은 복사 --");
		//arr1을 arr2로 복사
		arr2 = arr1.clone();
		
		//arr1의 값 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		//arr1의 hashCode 출력
		System.out.println("hashCode = " + arr1.hashCode());
		
		//arr2의 값 출력
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		//arr2의 hashCode 출력
		System.out.println("hashCode = " + arr2.hashCode());
		
		

	}

}
