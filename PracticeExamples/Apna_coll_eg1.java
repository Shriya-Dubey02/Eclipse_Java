package PracticeExamples;

public class Apna_coll_eg1 {
	public static boolean isPalidrome(int n)
	{
      int Palidrome=n;
      int reverse=0;
      while(Palidrome!=0)
      {
      int remainder= Palidrome%10;
      reverse= reverse *10 + remainder;
      Palidrome= Palidrome/10;
      }
      if(n==reverse)
      {
    	  
    	  return true;
      }
      else
      {
    	  return false;
      }
    
	}
	public static void arr(int marks[])
	{
		for(int i=0;i<=marks.length-1;i++)
		{
			marks[i]= marks[i]+1;
			System.out.println(marks[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int marks[]= {23,12,14};
		arr(marks);
	}
	


}
