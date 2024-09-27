package polymorphism;


// Method Overloading
public class Calculator {
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	void add(float a,float b)
	{
		System.out.println(a+b);
	}
	void add(int a,float b)
	{
		System.out.println(a+b);
	}
	void substr(float a,float b)
	{
		System.out.println(a-b);
	}
	
	void multip(float a,int b)
	{
		System.out.println(a*b);
	}


}
