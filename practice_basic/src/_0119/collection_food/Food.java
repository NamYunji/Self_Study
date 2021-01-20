package _0119.collection_food;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Food {
	public static void main(String[] args) {
		
		Food f = new Food();
		f.test1();
		f.test2();
		}
			


	private void test2() {
		//map객체 만들어서 먹고싶은 음식 출력
	 Map<String, Integer> food = new HashMap<>();
	 food.put("만두", 2);
	 food.put("곱창", 3);
	 food.put("막창", 1);
	 food.put("대창", 4);
	 food.put("닭발", 5);

	 Iterator<String> iter = food.keySet().iterator();
	 while(iter.hasNext()) {
		 String key = iter.next();
		Integer value = food.get(key);
		System.out.println("key = " + key + ", value = " + value);
	 }
	 
	}



	private void test1() {
		//list객체 만들어서 먹고싶은 음식 출력
		List<String> food = new ArrayList<String>();
		food.add("만두");
		food.add("대창");
		food.add("막창");
		food.add("곱창");
		food.add("닭발");
		
		Iterator<String> iter = food.iterator();
		while(iter.hasNext()) {
			String i = iter.next();
			System.out.println(i);
	}

}
}
