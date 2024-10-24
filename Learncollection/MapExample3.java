package Learncollection;

import java.util.TreeMap;
import java.util.Comparator;


public class MapExample3 {
	public static void main(String[] args) {
		
		TreeMap<Integer, Product> products= new TreeMap<Integer, Product>((i1,i2)->i2-i1);
			
		
		products.put(101, new Product(101,"Laptop",50000));
		products.put(102, new Product(102,"Mobile",30000));
		products.put(103, new Product(103,"Speaker",10000));
		
		System.out.println(products);
		Product laptop= products.get(101);
		System.out.println(laptop.getPrice());
	}

}
