package abstraction;

public class ExampleInterface3 {
	public static void main(String[] args) {
		R r=new R();
		r.add(20, 20);
		r.sub(10, 5);
		int ans = r.square(5);
		
		System.out.println(ans);
	}

}
