package PracticeExamples;

public class DecToBinary {
	
	public static void DecToBin(int n)
	{
		int MyNum=n;
		int pow=0;
		int binNum=0;
		
		
		while(n>0)
		{
			int rem= n%2;
			System.out.println(rem * (int)Math.pow(10, pow));
			binNum=binNum + (rem * (int)Math.pow(10, pow));
			// System.out.println(binNum);
			pow++;
			n=n/2;
			
		}
		System.out.println("binary form of: "+MyNum+" = "+binNum);
	}
	
	public static void main(String[] args) {
		
		DecToBin(5);
	}

}
