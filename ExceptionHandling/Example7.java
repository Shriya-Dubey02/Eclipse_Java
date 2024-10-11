package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileInputStream;



public class Example7 {
	
	// throws is used to skip the responsibility of handling exception
	public static void fileHandling() throws FileNotFoundException
	{
		new FileInputStream("abc.txt");
	}
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Hello");
		try
		{
			fileHandling();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}

}
