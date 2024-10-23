package Learncollection;

import java.util.PriorityQueue;

public class QueueExample2 {
	public static void main(String[] args) {
		
		PriorityQueue<Product> products= new PriorityQueue<Product>((p1,p2)->p2.getPrice()-p1.getPrice());
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(110,"Mobile",25000));
		products.add(new Product(103,"Headphones",2000));
		products.add(new Product(104,"Speakers",5000));
		
		System.out.println(products);
		System.out.println("=================================================");
		
		System.out.println(products.poll());
		System.out.println(products);
		
		System.out.println(products.peek());
	}

}
