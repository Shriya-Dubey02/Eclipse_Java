package ExceptionHandling;

public class Example4 {
	public static void main(String[] args) {
		
		String s="Laptop";
		
		// System.out.println(s.charAt(80));
		try
		{
			s.charAt(80);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index");
		}
	}

}
