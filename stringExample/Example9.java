package stringExample;

import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any string");
		String s1= sc.next();
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			if(s1.charAt(0)==s1.charAt(s1.length()-1) && s1.charAt(1)==s1.charAt(s1.length()-2)) {
				System.out.println("It is palidrome");
				
			}
			else {
				System.out.println("Not");
			}
		}
		
	}

}
