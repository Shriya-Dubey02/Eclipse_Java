package classesAndobjects;

public class staticExample {
	public static void main(String args[])
	{
		Employee1.ceo="Priyanka";
		Employee1 e1 = new Employee1(101,"Manish");
		Employee1 e2 = new Employee1(102,"Nitin");
		
		System.out.println(e1.ceo);
		System.out.println(e2.ceo);
		
	}

}
