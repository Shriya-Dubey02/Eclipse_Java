package ExceptionHandling;

public class Example9 {
	
	public static void checkAge(int age)
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is invalid");
		}
		else
		{
			System.out.println("Registration successful");
		}
	}
	
	public static void main(String[] args) {
		checkAge(13);
		
	}

}
