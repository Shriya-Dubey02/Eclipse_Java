package Learncollection;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample7 {
	public static void main(String[] args) {
		
		List<Product> product= new ArrayList<Product>();
		
		product.add(new Product(101,"Laptop",50000));
		product.add(new Product(110,"Mobile",25000));
		product.add(new Product(103,"Headphones",2000));
		
		// filter belongs to stream class 
		List<Product> pricegtan100 = product.stream().filter(products->products.getPrice()>10000).
				collect(Collectors.toList());
		
		System.out.println(pricegtan100);
		
	}

}
