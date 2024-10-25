package Learncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample1 {
	// Stream is a pipeline of objects
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=1;i<=20;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
		System.out.println("===============================");
		
		Stream<Integer> stream = list.stream();
		//ForEach   Map   Filter   methods
		// Stream creates a copy and operations and performed on it
		
		Consumer<Integer> c=(i)->System.out.println(i);
		stream.forEach(c);
		
		System.out.println("======================================");
		
		List<String> names = Arrays.asList("Shriya","Amit","Gurjeet","Chetan","Isha","Muskan");
		// System.out.println(names);
		Stream<String> namesStream= names.stream();
		
		Consumer<String> nameConsumer=(n)->System.out.println(n+" "+n.length());
		namesStream.forEach(nameConsumer);
		
		System.out.println("==============================================");
		
	}

}
