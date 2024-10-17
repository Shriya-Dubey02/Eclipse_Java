package Learncollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ListExample5 {
	public static void main(String[] args) {
		
		LinkedList<String> names= new LinkedList<String>();
		
		names.add("Shriya");
		names.add("Isha");
		names.add("Muskan");
		names.add("Ashvini");
		System.out.println(names);
		System.out.println("------------------------------------");
		
		Predicate<String> removeA= (name)-> name.startsWith("A");
		names.removeIf(removeA);
		System.out.println(names);
		
		System.out.println("------------------------------------");

		LinkedList<Product> products =new LinkedList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",25000));
		products.add(new Product(103,"Headphones",2000));
		
		System.out.println(products);
		
		Predicate<Product> price= ((p)-> p.getPrice()<10000);
		products.removeIf(price);
		System.out.println(products);
		
		Collections.sort();
		
		
	}

}
