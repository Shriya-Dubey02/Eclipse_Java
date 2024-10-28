package Learncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample8 {
	public static void main(String[] args) {
		// if some action is to be performed use map
		// and filter to filter out 
		// map belongs to stream
		// ForEach does not return values, Map does
		
		List<Integer> numbers = Arrays.asList(23,14,56,7);
		
		 Function<Integer, Integer> squareFunction= (n)->n*n;
		 List<Integer> squares= numbers.stream().map(squareFunction).collect(Collectors.toList());
		System.out.println(squares);
		
		List<Integer> multiply10 = numbers.stream().map(n->n*10).collect(Collectors.toList());
		System.out.println(multiply10);
		
		System.out.println("===================================================");
		
		List<String> names = Arrays.asList("Shriya","Nisha","Nikita","Ankita","Manish");
	    // Function<String, Integer> nameLength=  
		List<Integer> nameLength = names.stream().map(l -> l.length()).collect(Collectors.toList());
		
		System.out.println(nameLength);
		
		System.out.println("======================================================");
		
		List<Product> product = new ArrayList<Product>();
		product.add(new Product(101,"Laptop",50000));
		product.add(new Product(110,"Mobile",25000));
		product.add(new Product(103,"Headphones",2000));
		
		List<String> getName = product.stream().map(p->p.getName()).collect(Collectors.toList());
		
		System.out.println(getName);
		
		


		
		
		
		
	}

}
