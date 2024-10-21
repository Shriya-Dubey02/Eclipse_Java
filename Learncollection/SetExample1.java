package Learncollection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SetExample1 {
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet= new HashSet<Integer>();
		
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(50);
		hashSet.add(50);
		hashSet.add(70);
		
		System.out.println(hashSet);
		
		List<Integer> list = Arrays.asList(12,24,36,36,72,48,60,60);
		System.out.println(list);
		// converted List to Hashset to remove duplicate values
		HashSet<Integer> Set= new HashSet<Integer>(list);
		System.out.println(Set);
		// This is a set class
	}

}
