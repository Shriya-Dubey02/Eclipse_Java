package Inheritance;


class P
{
	void methodP()
	{
		System.out.println("Method of P class");
	}
}

class Q extends P
{
	void methodQ()
	{
		System.out.println("Method of Q class");
	}
	
}
class R extends Q
{
	void methodR()
	{
		System.out.println("Method of R class");
	}
}

class S extends R
{
	void methodS()
	{
		System.out.println("Method of S class");
	}
}
public class MultiLevelInheritanceExample {
	public static void main(String args[])
	{
		S obj1=new S();
		obj1.methodP();
		obj1.methodQ();
		obj1.methodR();
		obj1.methodS();
	}

}
