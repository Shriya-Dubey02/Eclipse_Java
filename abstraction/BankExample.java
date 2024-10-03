package abstraction;

public class BankExample {
	public static void main(String[] args) {
		
		// Parent can hold chils's object
		// here bank is holding SBI's object
		
		Bank sb= new ICICI();
		sb.details();
		sb.methodBank();
		sb.address();
		Bank.staticmethod();
		
		// Anonymous Inner class
		Bank Axis=new Bank()
		{
			public void details()
			{
				System.out.println("AXIS Bank");
			}
			
			public void address()
			{
				System.out.println("Address of AXIS bank");
			}
		};
		
		Axis.details();
		Axis.address();
	


	}
	

}
