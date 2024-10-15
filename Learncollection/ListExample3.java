package Learncollection;

import java.util.ArrayList;

public class ListExample3 {
	
	public static void main(String[] args) {
		
		ArrayList<Product> products =new ArrayList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(102,"Mobile",25000));
		products.add(new Product(103,"Headphones",2000));
		
		System.out.println(products);
		
		for(Product p1:products) {
			if(p1.getPrice()>20000)
			{
				System.out.println(p1);
				
			}
			System.out.println("-----------------------------------------------------");
			if(p1.getName().startsWith("M") || p1.getName().startsWith("m"))
				System.out.println(p1);
		}
	}

}
