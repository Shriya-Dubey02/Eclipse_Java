package ExceptionHandling;

// Runtime Exception
public class InvalidAgeException extends RuntimeException {
	
	// Every exception has 2 constructors 
	// Non paramaterised
	public InvalidAgeException()
	{
		super();
	}
	// Paramaterised
	public InvalidAgeException(String message)
	{
		super(message);
	}
	

}
