package stringExample;

public class Example8 {
	public static void main(String[] args) {
		
		int count=0;
		String s1="Mango";
		for(char ch:s1.toCharArray())
{
	if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'|| ch=='u')
	{
		count++;
	}
}
		System.out.println(count);
	}

}
