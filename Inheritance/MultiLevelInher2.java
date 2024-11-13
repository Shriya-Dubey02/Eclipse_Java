package Inheritance;


class W
{
	void methodP()
	{
		System.out.println("Method of P class");
	}
}

class V extends W
{
	void methodQ()
	{
		System.out.println("Method of Q class");
	}
	
}
class T extends V
{
	void methodR()
	{
		System.out.println("Method of R class");
	}
}

class X extends T
{
	void methodS()
	{
		System.out.println("Method of S class");
	}
}
public class MultiLevelInher2 {
	public static void main(String args[])
	{
		X obj1=new X();
		obj1.methodP();
		obj1.methodQ();
		obj1.methodR();
		obj1.methodS();
	}

}
