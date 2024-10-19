package Revision;

import java.util.function.Predicate;

public class Example4 {
	public static void main(String[] args) {
		
		Predicate<String> a= new Predicate<String>() {
			public boolean test(String name)
			{
				if(name.length()>3)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
		};
		System.out.println(a.test("Shriya"));
		
		Predicate<String> b=(name)->name.length()>3;
		
		System.out.println(b.test(""));
	
		
		
	}

}
