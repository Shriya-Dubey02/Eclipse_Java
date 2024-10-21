package Learncollection;

import java.util.Stack;

public class ListExample9 {
	public static void main(String[] args) {
		Stack<Integer> stack= new Stack<Integer>();
		stack.push(12);
		stack.push(20);
		stack.push(50);
		
		System.out.println(stack);
		// search method
		System.out.println(stack.search(20));
		
		System.out.println("=================================");
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.empty());
		
		// in stack indexing starts from last element i.e 1,2,3,---
		// search method is used for fetching index
		
		
		
	}

}
