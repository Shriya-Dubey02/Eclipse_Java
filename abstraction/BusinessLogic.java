package abstraction;

public abstract class BusinessLogic {
	abstract void coupons();

}
class Weekdays extends BusinessLogic
{
	void coupons()
	{
		System.out.println("WeekDays20");
	}
}

class Business {
	public static void main(String[] args) {
		
	
	 
		
	BusinessLogic weekend =new BusinessLogic()
			{
		void coupons(){
			System.out.println("Weekend20");
		}
		
		
			};
			
			
			weekend.coupons();
			
 }
	}
