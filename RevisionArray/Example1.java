package RevisionArray;

public class Example1 {
	public static void main(String[] args) {
		
		int arr[]= {2,5,1,10,11};
		int smallest=arr[0];
		int biggest= arr[0];
		
		for(int n:arr)
		{
			if(smallest>n)
			{
				smallest=n;
			}
			if(biggest<n)
			{
				biggest=n;
			}
		}
		System.out.println("Smallest is: "+smallest);
		System.out.println("Biggest is: "+biggest);
	}

}
