package abstraction;


	// Functional Interface : it has only one abstract method
	
	@FunctionalInterface
	interface Test
	{
		boolean isEven(int n);
			
	}
	// (n)->n%2==0;
	// lambda function is used instead of anonymous inner class
	
	public class ExampleInterface4 {
	public static void main(String[] args) {
		
		/*
		 new Test(){
		 public boolean isEven(int n)
		 {
		 return n%2==0;
		 }
		 };
		 */
		Test t1= (n)->n%2==0; // lambda function
		boolean ans= t1.isEven(56);
		System.out.println(ans);
	}

}
