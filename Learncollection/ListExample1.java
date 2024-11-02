package Learncollection;

import java.util.ArrayList;

public class ListExample1 {
	
	public static void main(String[] args) {
		ArrayList list= new ArrayList<>(); // we have not specified the type in angular brackets
		// add method 
		list.add(22);
		list.add("Shriya");
		list.add(null);
		list.add(56.24);
		
		System.out.println(list);
		// List stores by default object's class objects
		for(Object i:list) {
			System.out.println(i);
		}
		// code
	}

}
