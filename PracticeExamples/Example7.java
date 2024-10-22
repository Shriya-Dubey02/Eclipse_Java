package PracticeExamples;

class Example7
{
	public static int factorial(int n)
	{
		int fact= 1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}
	
	public static int binCoeff(int n,int r)
	{
		int fact_n= factorial(n);
		int fact_r = factorial(r);
		int fact_nmr=factorial(n-r);
		
		int binCoeff= fact_n/(fact_r*fact_nmr);
		return binCoeff;
	}
	
	public static boolean ifPrime(int p)
	{
		boolean ifPrime=true;
		int count=0;
		for(int i=1;i<=p;i++)
		{
			if(p%i==0)
			{
				count++;
			}
		}
		if(count==2)
			return ifPrime;
		else
		{
			return ifPrime= false;
		}
		
	
	}
	
	public static void primesInRange(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(ifPrime(i))
			System.out.print(i+" ");
		}
		
	}
	// Function Overloading
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	
	public static float sum(float a,float b)
	{
		return a+b;
	}
	
	public static void main(String[] args) {
		
		// System.out.println(factorial(7));
		
		System.out.println(binCoeff(5,2));
		System.out.println(sum(2,3));
		System.out.println(sum(5,6,2));
		System.out.println(sum(3.2f,4.8f));
		System.out.println("==================");
		System.out.println(ifPrime(75));
		primesInRange(10);
		primesInRange(100);
	}
}





