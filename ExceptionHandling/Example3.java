package ExceptionHandling;
import java.util.*;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try
		{
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2= sc.nextInt();
		System.out.println("Division is "+(num1/num2));
		}
		catch(ArithmeticException e)
		{
			System.out.println("You cannot divide number by 0");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input");
		}
	}

}
