package encapsulation;

public class ProductExample {
	public static void main(String[] args) {
		
		// Every class inherits objects. Here object becomes the parent so we have to override the class
		Product p1= new Product(101,"Laptop");
		Product p2=new Product(102,"Mobile");
		System.out.println(p1);
		System.out.println(p2);
	}

}
