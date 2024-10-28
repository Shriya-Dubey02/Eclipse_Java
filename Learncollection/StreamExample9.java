package Learncollection;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class StreamExample9 {
	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(10,20,35,40,100,22);
		// BinaryOperator<T>
		Optional<Integer> reduce =list.stream().reduce((a,b)->a+b);
		System.out.println(reduce);
		
	}

}
