package ExceptionHandling;

public class Example10 {
	public static void checkNum(int n) throws NegativeNumberException
	{
		if(n<0) 
		{
			throw new NegativeNumberException("Number is negative");
		}
		else
		{
			System.out.println("Good to go");
		}
			
	}
	
	public static void main(String[] args) {
		try {
			checkNum(-5);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
