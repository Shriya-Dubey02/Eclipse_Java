package Revision;

import java.util.function.Predicate;

public class Example3 {
	public static void main(String[] args) {
		
		Predicate<Integer> p1=new Predicate<Integer>() {
			public boolean test(Integer i)
			{
				return i%7==0;
			}
			
			
		};
		System.out.println(p1.test(70));
		
		Predicate<Integer> p2=(i)->i%7==0;
		System.out.println(p2.test(64));
	}

}
// test("Priti") true iF >3
// test("") 0 false