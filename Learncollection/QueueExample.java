package Learncollection;

import java.util.PriorityQueue;

public class QueueExample {
	public static void main(String[] args) {
		
		// order will not be maintained
		// It removes element from start 
		PriorityQueue<Integer> numbers= new PriorityQueue<Integer>((i1,i2)->i2-i1);
		for(int i=1;i<=20;i++)
		{
			numbers.add(i);
		}
		System.out.println(numbers);
		System.out.println("------------------------");
		
		//poll is used to remove elements
		// the first element would always be the smallest
		System.out.println(numbers.poll());
		System.out.println(numbers);
		
		System.out.println("------------------------------------");
		System.out.println(numbers.poll());
		System.out.println(numbers);
	
}
	

}
