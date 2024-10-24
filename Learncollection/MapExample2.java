package Learncollection;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class MapExample2 {
	public static void main(String[] args) {
		
		// HashMap does not maintain insertion order
		// LinkedHashMap does
		Scanner sc=new Scanner(System.in);
		
		LinkedHashMap<String, String> phonenumbers=new LinkedHashMap<String, String>();
		phonenumbers.put("Shriya", "7058315398");
		phonenumbers.put("Muskan", "8984738748");
		phonenumbers.put("Isha", "9835772638");
		
		System.out.println(phonenumbers.get("Shriya"));
		System.out.println("-------------------------------------");
		
		String name=sc.next();
		
		if(phonenumbers.containsKey(name))
		{
			System.out.println("Your phoneno is present: "+phonenumbers.get(name));
			System.out.println("Do you want to change it(y/N)");
			char decision=sc.next().charAt(0);
			
			if(decision=='y')
			{
				String newphoneno=sc.next();
				phonenumbers.put(name, newphoneno);
			}
		}
		else
		{
			String phoneno=sc.next();
			phonenumbers.put(name, phoneno);
		}
	}

}
