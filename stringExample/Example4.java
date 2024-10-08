package stringExample;

public class Example4 {
	public static void main(String[] args) {
		String name= "shriya";
		name= name.concat(" Dubey");
		System.out.println(name.toUpperCase());
		
		System.out.println("==============");
		System.out.println("   He          ll            o           ".trim()+"World");
		
		System.out.println("Shriya".length());
		
		System.out.println("Shreyash".charAt(2));
		System.out.println("===============================");
		
		System.out.println("Laptop".indexOf('p',3));
		System.out.println("Whatsapp".indexOf('a',4));
		System.out.println("===============================");
		
		System.out.println("Laptop".startsWith("La"));
		
		String s2= "Bottle";
		char arr[]= s2.toCharArray();
		for(char ch:arr)
		{
			System.out.println(ch);
		}
		System.out.println("=================================");
		
	}

}
