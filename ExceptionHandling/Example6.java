package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

// Compiled time Exception
public class Example6 {
	public static void main(String[] args) {
		try
		{
			new FileInputStream("abc.txt");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}

}
