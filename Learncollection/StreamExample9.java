package Learncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamExample9 {
	public static void main(String[] args) {
		
		// List<Integer> list= Arrays.asList(10,20,35,40,100,22);
		List<Integer> numbers=new ArrayList<Integer>();
		
		// BinaryOperator<T>
		
		// Optional is used to avoid exception for meanwhile
		// for example while searching IDs if 101 is not present instead of 
		// exception we can give other value
		
		Optional<Integer> reduce =numbers.stream().reduce((a,b)->a+b);
		System.out.println(reduce);
		
//		Integer integer=reduce.get();
//		System.out.println(integer);
		
		// Supplier functional interface
		// list should be empty for this
		Integer i = reduce.orElseThrow(()->new RuntimeException("List is empty"));
		System.out.println(i);
	}

}
