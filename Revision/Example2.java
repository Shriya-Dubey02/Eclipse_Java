package Revision;
@FunctionalInterface
interface I3
{
	void printAnyName(int n);
}
@FunctionalInterface
interface I5
{
	int add(int a,int b);
}

public class Example2 {
	public static void main(String[] args) {
		// 1
		I3 i=(n)->
		{
			for(int j=1;j<=n;j++)
				System.out.println("Shriya");
		};
		
		i.printAnyName(5);
		
		// 2
		I5 q=new I5() {
			
			public int add(int a,int b) {
				
			
			return a+b;
			}
		};
		
		System.out.println(q.add(20, 30));
		
		// lambda
		I5 p=(a,b)-> a+b;
		
		System.out.println(p.add(10, 20));
	}

}
