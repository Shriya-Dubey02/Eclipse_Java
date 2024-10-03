package abstraction;

public class A implements I1{
	
	public void display()
	{
		System.out.println("Overriden method of A class");
	}
	
	public void square(int n)
	{
		System.out.println(n*n);
	}
	
	public void rectangle(int p,int q)
	{
		System.out.println(p*q);
	}

}
