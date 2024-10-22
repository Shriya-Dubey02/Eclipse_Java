package PracticeExamples;

public class BinToDecimal {
	
	public static void BinToDec(int binNum)
	{
		int myNum=binNum;
		int pow=0;
		int dec=0;
		
		while(binNum>0)
		{
			int lastDigit= binNum%10;
			dec= dec +(lastDigit * (int)Math.pow(2, pow));
			pow++;
			binNum= binNum/10;
			
		}
		System.out.println("Decimal of "+myNum+" is: "+dec);
	}
	
	public static void main(String[] args) {
		
		BinToDec(101010111);
	}

}
