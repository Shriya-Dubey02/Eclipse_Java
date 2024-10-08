package stringExample;

public class Example5 {
	public static void main(String[] args) {
		
		String s1="MobileOOoo";
		int count=0;
		
		for(int i=(s1.length()-1);i>=0;i--)
		{
			System.out.println(s1.charAt(i));
			
			
		}
		System.out.println("=======================");
		
		for(char ch:s1.toCharArray())
		{
			if(ch=='o' || ch=='O')
				count++;
		}
		System.out.println(count);
		
		
	}
	// 1) Count no of vowels in a string
	// 2) Palindrome   Madam reverse it madam
	// 3) H    e    l      lo
	//  4) Priti Amit Gurjeet Joel String which starts with p

}
