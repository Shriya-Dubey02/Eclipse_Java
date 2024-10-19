package RevisionArray;

public class Example3 {
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int last_element= arr1[arr1.length-1],i;
		for(i=arr1.length-1;i>0;--i)
		{
			arr1[i]=arr1[i-1];
			arr1[0]=last_element;
			System.out.print(arr1[i]+",");
		
		}
		
	}

}
