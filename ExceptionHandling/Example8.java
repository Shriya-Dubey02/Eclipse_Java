package ExceptionHandling;

public class Example8 {
	
	// throw is used to give exception manually
	// here we have given nullPointerException
	public static void throwException()
	{
		throw new NullPointerException("Priti");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		
		
		try
		{
			throwException();
		}
		catch(NullPointerException e)
		{
			System.out.println("Bye");
		}
		
	
		
	}

}
