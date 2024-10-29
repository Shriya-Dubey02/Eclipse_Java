package Learncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample10 {
	public static void main(String[] args) {
		
		//List<Integer> list = Arrays.asList(12,34,15,20,3);
		List<Integer> list= new ArrayList<Integer>();
		Optional<Integer> first=list.stream().findFirst();
		System.out.println(first);
		
// 	Integer integer= first.get();
//		System.out.println(integer);
	 
		Integer i = first.orElseThrow(()-> new ArithmeticException("List is empty"));
		
	}

}
