package Learncollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamExample11 {
	public static void main(String[] args) {

		List<Integer> list= new ArrayList<Integer>();
		for(int i=1;i<=100;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		// stream gives only 1 stream
		// parallel stream says pipeline will spilt to 4
		Optional<Integer> Anyno = list.parallelStream().findAny();
		System.out.println(Anyno);
		
		list.parallelStream().forEach((n)->System.out.println(n));
		
		System.out.println("=================================================");
		
		
		boolean Anymatch=list.stream().anyMatch((n)->n%2==0);
		System.out.println(Anymatch);
		// min 1 Match required to be true
		
		boolean anyMatch2 = list.stream().anyMatch((n)-> n>1000);
		System.out.println(anyMatch2);
		
		// all match required to be true
		boolean allMatch = list.stream().allMatch((n)->n%2==0);
		System.out.println(allMatch);
		
		// no match to be true
		boolean noneMatch=list.stream().noneMatch((n)->n>1000);
		System.out.println(noneMatch);
		
		
	}

}
