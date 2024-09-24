package classesAndobjects;

public class Example {
	public static void main(String args[]) {
		Product p1=new Product();
		p1.setProductDetails(101, "Manish", 25000);
		System.out.println("Pay : "+p1.discount());
		
		Product p2=new Product();
		p2.setProductDetails(102, "Nitin", 30000);
		System.out.println("Pay : "+p2.discount());
	}

}
