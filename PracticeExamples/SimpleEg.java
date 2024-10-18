package PracticeExamples;
import java.util.*;

class PracticeExamples{
	
public static int printHello()
{
	System.out.println("Hii");
	return 14;
}
public static void swap(int a,int b)
{
	int temp=a;
	int a=b;
	int b=temp;
}



	public static void main(String[] args) {
		System.out.println(printHello());
		int a=5;
		int b=7;
		swap(a,b);
		System.out.println(a);
		System.out.println(b);
	}
	}

