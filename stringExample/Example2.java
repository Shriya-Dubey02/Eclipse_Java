package stringExample;

public class Example2 {
	public static void main(String[] args) {
		String a="Hello";
		String b="HELLO";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals("Hello"));
		
		System.out.println("========================");
		
		System.out.println(a.equalsIgnoreCase(b));
		
		// CompareTo operator
		// String1 > String2  +ve 
		// String1 < String2  -ve
		// String1 = String2   0
		
		String c="A";
		String d="C";
		String e="a";
		
		System.out.println(c.compareTo(d));
		System.out.println(e.compareTo(c));
		
		System.out.println("=========================");
		
		String s="INDIA";
		System.out.println(s.toLowerCase());
		// s=s.toLowerCase();
		System.out.println(s);
		
	}

}
