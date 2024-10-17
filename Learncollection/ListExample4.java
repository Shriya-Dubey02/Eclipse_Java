package Learncollection;
import java.util.*;
import java.util.function.Predicate;

public class ListExample4 {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(12);
		list.add(15);
		list.add(17);
		
		System.out.println(list);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
		System.out.println("------------------------------");
		list.add(0,100);
		// add will shift the elements
		System.out.println(list);
		
		System.out.println("------------------------------------");
		
		Integer i= list.get(3);
		System.out.println(i);
		
		System.out.println("------------------------------------");
		
		list.set(0, 200);
		// set will replace the elements
		System.out.println(list);
		
		System.out.println("------------------------------------");
	
		// we have to create predicate object for removeIf function
		Predicate<Integer> even=(num)->num%2==0;
		list.removeIf(even);
		System.out.println(list);
	}

}
