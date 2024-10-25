package Learncollection;

import java.util.ArrayList;

public class StreamExample3 {
	public static void main(String[] args) {
		ArrayList<Product> products= new ArrayList<Product>();
		
		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(110,"Mobile",25000));
		products.add(new Product(103,"Headphones",2000));
		products.add(new Product(104,"Speakers",5000));
		
		products.stream()
		.forEach(pname-> System.out.println(pname.getName()));
		System.out.println("============================================");
		
		products.stream().forEach(discount->{
			// int d=(discount.getPrice() * 20/100);
			System.out.println(discount.getName()+" "+discount.getPrice()*0.8);
		});
		
	}

}
