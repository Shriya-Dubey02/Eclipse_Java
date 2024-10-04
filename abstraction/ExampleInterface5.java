package abstraction;

@FunctionalInterface
interface I6
{
	void printName(String name);
}

@FunctionalInterface
interface I7
{
	int add(int a,int b);
}

@FunctionalInterface
interface I8
{
	int square(int n);
}

public class ExampleInterface5 {
	
	public static void main(String[] args) {
		
		I6 obj= (name)-> System.out.println("My name is "+name);
		obj.printName("Shriya");
		
//		I6 obj1 =(name)-> 
//		{
//			for(int i=1;i<=100;i++)
//			{
//				System.out.println(name);
//			}
//		};
//		
//		obj1.printName("Shreyash");
		
		I7 addition= (a,b)-> a+b;
		System.out.println(addition.add(20, 60));
		
		I8 sq=(n)-> n*n;
		System.out.println(sq.square(7));
	}

}
