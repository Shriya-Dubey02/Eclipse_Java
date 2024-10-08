package stringExample;

public class Example6 {
	public static void main(String[] args) {
		
		// Strings are immutable
		// StringBuilder and StringBuffer makes string mutable
		
		StringBuilder sb= new StringBuilder("Hello");
		sb.reverse();
		
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		sb.replace(0, 2, "**********");
		// 2 is exclusive
		
		System.out.println(sb);
		System.out.println("-----------------------");
		sb.append("World");
		
		System.out.println(sb);
		// It does not return anything
		// it does changes in  the same string
		
		sb.delete(0, 14);
		System.out.println(sb);
	}

}
