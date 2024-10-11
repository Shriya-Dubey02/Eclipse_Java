package ExceptionHandling;

// Runtime Exception
public class InvalidAgeException extends RuntimeException {
	
	// Every exception has 2 constructors 
	public InvalidAgeException()
	{
		super();
	}
	public InvalidAgeException(String message)
	{
		super(message);
	}
	

}
