package Learncollection;

import java.util.LinkedList;

public class QueueExample3 {
	
	// DeQueue Example
	// elements can be added and removed from both ends
	public static void main(String[] args) {
		LinkedList<Integer> list= new LinkedList<Integer>();
		// it will not add 50 at last bcoz at first list was empty
		list.addLast(50);
		for(int i=1;i<=10;i++)
		{
			list.add(i);
		}
		
		list.addFirst(30);
		System.out.println(list);
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println();
		
		
	}

}
