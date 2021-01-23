package _0121.collectionTest;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		CollectionTest ct = new CollectionTest();
		ct.test1();
		ct.test2();
	}

	private void test1() {
		List<String> list = new ArrayList<>();
		list.add("푸항항");
		list.add("남윤지");
		list.add("쁑쁑");
		System.out.println(list);
		
		//null에서 String에 기본적으로 정의되어있는 compareTo가 기본정렬방식이 됨
		list.sort(null);
		System.out.println(list);
	}
	
	private void test2() {
		// TODO Auto-generated method stub
		
	}

}
