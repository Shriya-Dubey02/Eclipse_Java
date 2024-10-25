package Learncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample4 {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,56,45,78,90,98);
		Stream<Integer> even = list.stream().filter(n->n%2==0);
		even.forEach(n->System.out.println(n));
	}

}
