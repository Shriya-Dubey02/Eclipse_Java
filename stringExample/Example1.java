package stringExample;

public class Example1 {
	public static void main(String[] args) {
		
		// Ways to create string
		// 1) By using String Literal
		
		String a= "Hello";
		String b= "Hello";
		
		// 2) By using new keyword
		
		String c=new String("Hello");
		String d=new String("Hello");
		System.out.println("===========================");
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(c==d);
	}

}
