package ExceptionHandling;

public class Example1 {
	public static void main(String[] args) {
		
		System.out.println("Hello");
		// try and catch methods are used for exception handling
		// In try write the error code
		try
		{
			System.out.println(5/0);
		}
		// In catch store the exception in variable 'e'
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Code after exception");
	}

}
