package ExceptionHandling;

public class Example5 {
	public static void main(String[] args) {
		try
		{
			System.out.println(5/0);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
		}
		
		// finally block is executed when exception is not handled by even try and catch
		// It is executed everytime
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("Code after exception");
	}

}
