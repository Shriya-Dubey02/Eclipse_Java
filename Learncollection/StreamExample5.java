package Learncollection;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample5 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<Integer>();
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			list.add(i);
		}
		System.out.println(list);
		
		Stream<Integer> str =list.stream();
		Consumer<Integer> c=(k)->{
			int count=0;
			for(int j=1;j<=n;j++)
			{
			if(n%j!=0)
			{
				count++;
				
			}

			}
			System.out.println(count);
		};
		str.forEach(c);
	}

}
