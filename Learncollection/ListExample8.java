package Learncollection;

import java.util.Iterator;
import java.util.LinkedList;

public class ListExample8 {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(112);
		list.add(10);
		list.add(25);
		
		Iterator<Integer> iterator=list.iterator();
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
		
		// hasNext tells us if element is present in iterator 
		// It returns boolean values
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
