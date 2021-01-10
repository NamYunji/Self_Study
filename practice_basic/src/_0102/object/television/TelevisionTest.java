package _0102.object.television;

/*
- TelevisionTest 클래스: main 메소드에서 다음을 수행
(1) 크기가 3인 텔레비전 배열에 텔레비전을 생성하여 저장
(2) 텔레비전 채널을 7, 9, 11로 지정
(3) 반복문을 이용하여 배열에 저장된 모든 텔레비전의 채널을 출력
*/
public class TelevisionTest {
	public static void main(String[] args) {
		// int[] arr = new int [3];
		// arr[0] = 7;
		//생성자 사용법 : 객체를 만들어준다
		//생성자는 객체를 만들때, 자동으로 호출된다
		//객체를 만들면, 자동으로 생성되어서 자기 역할을 다 하고 죽는다
		//귀찮은걸 싫어함. 
		//일반 메소드 : 객체 생성 + 메소드호출(객체.메소드)
		//근데 이거 하기가 귀찮음...
		//그래서 생성자를 만들어준 것
		//메소드를 따로 호출하지 않고, 
		Television[] tv = new Television[3];
		tv[0] = new Television(7);
		tv[1] = new Television(9);
		tv[2] = new Television(11);

	}
	

}
