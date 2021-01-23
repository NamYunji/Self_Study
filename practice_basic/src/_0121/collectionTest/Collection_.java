package _0121.collectionTest;

import java.util.HashSet;
import java.util.Set;

public class Collection_ {
	public static void main(String[] args) {
		Collection_ ct = new Collection_();
		ct.test1();
		ct.test2();
	}

	private void test2() {
		
	}

	private void test1() {
		Set<Student> set = new HashSet<Student>();
		Student s1 = new Student(0, "남윤지");
		Student s2 = new Student(0, "남윤지");
		Student s3 = new Student(1, "남윤지");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		System.out.println(set);
		System.out.println(set.size());
		
	}

}
