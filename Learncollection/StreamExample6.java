package Learncollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample6 {
	public static void main(String[] args) {
		
		List<Integer> numbers= Arrays.asList(12,56,78,19,40);
		
		numbers.stream().filter(n->n>20).forEach(n->System.out.println(n));
		
		System.out.println("======================================");
		
		// Collect method gives a new list
		//Collect is a class and collector is a method which returns asList method
		
	   // Collector<Object, ?, List<Object>> list = Collectors.toList();
		List<Integer> greaterThan20 = numbers.stream().filter(n->n>20).collect(Collectors.toList());
		
		System.out.println(greaterThan20);
		System.out.println("========================================");
		
		List<String> names = Arrays.asList("Shriya","Nisha","Nikita","Ankita","Manish");
		List<String> StartswithN = names.stream().filter(name->name.startsWith("N")).
				collect(Collectors.toList());
		
		System.out.println(StartswithN);
	}

}
