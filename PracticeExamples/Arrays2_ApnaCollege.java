package PracticeExamples;

public class Arrays2_ApnaCollege {
	public static void reverse(int arr1[])
	
	{
		int first=0;
		int last=arr1.length-1;
		
		
		while(first<last)
		{
			int temp=arr1[last];
			arr1[first]= arr1[last];
			arr1[first]= temp;
			
			first++;
			last--;
			
		}
	}
	public static void main(String[] args) {
		
		int arr1[]= {2,4,6,8,10};
		reverse(arr1);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]+" ");
		}
		
	}

}
