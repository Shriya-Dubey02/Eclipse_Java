package patterns;
class Pattern
{
	public void squareframe(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || j==1 || i==n || j==n || i==2 || j==2 || i==(n-1)|| j==(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}	
			}
			System.out.println();
		}
	}
}


public class Pattern3eg {
	
	Pattern obj1=new Pattern();
	for(int i=1;i<=10;i++)
	{
		obj1.squareframe(10);
	}

}
