package Learncollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// Sort algorithms

public class ListExample7 {
	public static void main(String[] args) {
		
		List<Product> products= new LinkedList<Product>();

		products.add(new Product(101,"Laptop",50000));
		products.add(new Product(104,"Mobile",25000));
		products.add(new Product(103,"Headphones",2000));
		
		Comparator<Product> idComparator= (p1,p2)->p2.getId()-p1.getId();
		Comparator<Product> nameComparator=(p1,p2)->p1.getName().compareTo(p2.getName());
		Comparator<Product> priceComparator=(p1,p2)->p1.getPrice()-p2.getPrice();
		
		Collections.sort(products,idComparator);
		Collections.sort(products,nameComparator);
		Collections.sort(products,priceComparator);
		
		System.out.println(products);
		
	}

}
