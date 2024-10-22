package Learncollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetExample3 {
	public static void main(String[] args) {
		
		// Linked HashSet
		// order is maintained and unique, null values are allowed
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(11);
		set.add(12);
		set.add(12);
		System.out.println(set.isEmpty());
		System.out.println("=====================");
		
		// if excess remove operations are happening then we use iterator instead of for loop
		// hasNext returns boolean
		Iterator<Integer> iterator= set.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		}

}
