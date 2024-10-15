package Learncollection;

import java.util.ArrayList;

public class ListExample2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>(); // <Wrapper class>
		list.add(45);
		list.add(23);
		list.add(25);
		
		System.out.println(list);
		
		for(Integer l1:list)
		{
			System.out.println(l1);
		}
		System.out.println("-----------------");
		System.out.println(list.size());
		System.out.println("-----------------");
		
		list.remove(list.size()-1);
		System.out.println(list);
		
		
		ArrayList<Integer> list2= new ArrayList<Integer>();
		list2.add(12);
		list2.add(24);
		list2.add(36);
		
		list.addAll(list2);
		System.out.println(list);
		
		list.removeAll(list2);
		System.out.println(list);
	}

}
