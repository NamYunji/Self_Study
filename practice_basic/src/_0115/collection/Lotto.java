package _0115.collection;

import java.util.HashSet;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		//list, set, map
		//set : 
		Set<Integer> set = new HashSet<Integer>();


		while((true)) {
			int i = (int)(Math.random() * 45) + 1;						
			set.add(i);
			if (set.size() == 6) {
				break;
			}
		}
		
		System.out.println(set);
	}
}
