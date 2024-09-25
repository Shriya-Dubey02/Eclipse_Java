package Inheritance;


	class A
	{
		int add(int a,int b)
		{
			return a+b;
		}
		// Constructor
		A()
		{
			System.out.println("A Constructor");
		}
		A(String value)
		{
			System.out.println("Parameterized constructor(A): "+value);
		}
	}
	class B extends A
	{
		int sub(int a,int b)
		{
			return a-b;
		}
		// Constructor
		B()
		{
			System.out.println("B Constructor");
		}
		B(String value)
		{
			super(value);// super will call parameterized constructor of A
			// It will store value in value
			// by default non parameterized constructor is called therefore super
			// to call parameterized one super(value)
			System.out.println("Parameterized constructor(B): "+value);
		}
	}
	
	
	public class SingleInheritance {
	
	public static void main(String args[])
	{
		B obj= new B("Shriya");
		int sum=obj.add(12, 10);
		System.out.println(sum);
		
		System.out.println(obj.sub(20, 5));
	}

}
