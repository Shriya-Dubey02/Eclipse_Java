package abstraction;

public class BusinessLogicMain {
	public static void main(String[] args) {
		
		Business weekend =new Business()
		      {
	               void coupons(){
		           System.out.println("Weekend20");
	           }
	
	
		  };
		 weekend.coupons();
	}

}
