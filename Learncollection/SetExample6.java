package Learncollection;

import java.util.Comparator;
import java.util.TreeSet;

public class SetExample6 {
	public static void main(String[] args) {
		
		TreeSet<Product> Tproduct= new TreeSet<Product>((p1,p2)->p1.getId()-p2.getId());
		
		// TreeSet does not know how to sort product objects 
		// So we make comparator 
		Tproduct.add(new Product(101,"Laptop",50000));
		Tproduct.add(new Product(110,"Mobile",25000));
		Tproduct.add(new Product(103,"Headphones",2000));
		
		System.out.println(Tproduct);
	}

}
