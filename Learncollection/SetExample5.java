package Learncollection;

import java.util.TreeSet;

public class SetExample5 {
	public static void main(String[] args) {
		
		TreeSet<Integer> tSet= new TreeSet<Integer>();
		tSet.add(5);
		tSet.add(10);
		tSet.add(20);
		tSet.add(44);
		tSet.add(36);
		tSet.add(49);
		
		System.out.println(tSet);
		System.out.println(tSet.higher(20)); // used for sorting
		System.out.println(tSet.lower(10));
		System.out.println(tSet.lower(5));
		
		System.out.println("====================");
		
		System.out.println(tSet.ceiling(44));
		System.out.println(tSet.ceiling(47));
		System.out.println(tSet.floor(21));
		System.out.println(tSet.floor(10));
		
		System.out.println("===========================");
		
		System.out.println(tSet.headSet(36,true));// for including 36 we write true
		System.out.println(tSet.tailSet(10,false));// for exclusing 10 we write false
		
		System.out.println("==============================");
	
		System.out.println(tSet.subSet(10, 44));
		System.out.println(tSet.subSet(10,true, 44,true));
		
		
	}

}
