package Learncollection;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Shriya","Amit","Gurjeet","Chetan","Isha","Muskan");
		names.stream().forEach(name->{
			
			for(int i=1;i<=5;i++)
			{
				System.out.println(name);
			}
			System.out.println("=========================================");
		});
		
		System.out.println("========================================");
	  
		names.stream().forEach(name->{
	
		System.out.println(name.charAt(0)+" "+name.charAt(name.length()-1));
		});
	

	}

}
