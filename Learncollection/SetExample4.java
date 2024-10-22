package Learncollection;

import java.util.Comparator;
import java.util.TreeSet;

public class SetExample4 {
	public static void main(String[] args) {
		
		// TreeSet 
		// It has unique values and it cannot contain null values
		// by default it arranges elements in ascending values
		
		Comparator<Integer> c= (o1,o2)->o2-o1; // to sort in descending order
		TreeSet<Integer> treeSet= new TreeSet<Integer>(c);
		treeSet.add(20);
		treeSet.add(40);
		treeSet.add(30);
		treeSet.add(60);
		//treeSet.add(null);
		
		System.out.println(treeSet);
	}

}
