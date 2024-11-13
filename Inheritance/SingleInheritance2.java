package Inheritance;

class Y
{
	int mult(int a,int b)
	{
		return a*b;
	}
	Y()
	{
		System.out.println("non-para");
	}
	Y(String value)
	{
		System.out.println("para of Y "+ value);
	}
}

class Z extends Y{
	int divi(int a,int b)
	{
		return a/b;
		
	}
	Z(){
		System.out.println("non-para of B");
	}
	Z(String value){
		super(value);
		System.out.println("para of Z "+value);
	}
}



public class SingleInheritance2 {
	public static void main(String[] args) {
		
		Z obj=new Z("Shriya");
		int sum=obj.mult(20, 5);
		System.out.println(sum);
		
		System.out.println(obj.divi(20, 4));
	}

}
