package Learncollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListExample6 {
	public static void main(String[] args) {
		
		// asList will create a List
		List<Integer> numbers =Arrays.asList(12,56,78,99,1,0);
		System.out.println(numbers);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		
		System.out.println("Smallest Element: "+numbers.get(0));
		System.out.println("Biggest Element: "+numbers.get(numbers.size()-1));
	}

}
