package _0119.collection_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionTest {
	
	//필드로 썼을 때, 클래스내의 메소드들이 가져다 쓸 수 있다
	List<String> list;
	//if 다른 클래스에서도 필드를 가져다쓰게 하려면
//	static List<String> list;
	
	public static void main(String[] args) {
		CollectionTest ct = new CollectionTest();
//		ct.test1();
//		ct.test2();
		ct.test3();

	}
	
	/*
	 * LinkedList
	 */
	private void test3() {
		list = new LinkedList<String>();
		while(true) {
			String lotto = Integer.toString((int)(Math.random()*7) + 1);
			list.add(lotto);
			if (list.size() == 6) {
				break;			
			}	
		}
		System.out.println(list);
	}

	private void test2() {
		List<String> list = new ArrayList<String>();
		
		String lotto = Integer.toString((int)(Math.random()*7) + 1);
		while(true) {
			list.add(lotto);
			if (list.size() == 6) {
				break;			
			}
		}
		System.out.println(list);
	}

	
	
	private void test1() {
		Set<String> set = new HashSet<String>();
		
		while(true) {
			String lotto = Integer.toString((int)(Math.random()*7) + 1);
			set.add(lotto);
			if (set.size() == 6) {
				break;			
			}
		}
		System.out.println(set);
	}

}
