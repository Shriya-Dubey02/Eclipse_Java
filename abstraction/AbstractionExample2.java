package abstraction;

abstract class Product
{
	abstract void details();
}

class Mobile extends Product
{
	void details()
	{
		System.out.println(1+" iphone");
	}
}


public class AbstractionExample2 {
	public static void main(String[] args) {
		new Mobile().details();
		
		// Anonymous inner class : Instead of mobile class we can use this 
		Product laptop =new Product() {
			void details()
			{
				System.out.println("Laptop details");
			}
	};
	laptop.details();
	
	// 2
	Product headphones= new Product()
	{
		void details()
		{
			System.out.println("headphones details");
		}
	};
	headphones.details();

}
}
