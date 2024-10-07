package stringExample;
import java.util.*;

public class Example3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String password = "X#123";
		
		System.out.println("Enter your password");
		String pass=sc.nextLine();
		
		
		if(pass.equals(password))
		
		System.out.println("Password is correct");
		
		else
		 
		System.out.println("Login failed");
		
	}

}
