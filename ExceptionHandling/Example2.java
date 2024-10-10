package ExceptionHandling;
import java.util.*;

public class Example2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		
		try
		{
			int n=sc.nextInt();
		}
		catch(InputMismatchException exc)
		{
			System.out.println("Invalid input");
		}
		
		System.out.println("Code after taking input");
	}

}
