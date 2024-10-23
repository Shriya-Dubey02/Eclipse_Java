package PracticeExamples;

public class Apna_coll_eg2 {
	
	public static int SumofDigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			int LastDigit= n%10;
			sum=sum+LastDigit;
			n=n/10;
		
		}
		// System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(SumofDigits(12345));
		
	}

}
