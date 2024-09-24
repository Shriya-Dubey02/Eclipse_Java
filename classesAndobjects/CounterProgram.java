package classesAndobjects;

// Static keyword is assigned to all objects together
// It is used to assign to all objects
class Counter
{
	static int count=0;
	Counter()
	{
		count++;
		System.out.println(count);
	}
	Counter(int count)
	{
		
	}
}

public class CounterProgram {
	public static void main(String args[])
	{
		new Counter();
		new Counter();
		new Counter();
		new Counter();
		new Counter();
	}
	

}
