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
	


}
