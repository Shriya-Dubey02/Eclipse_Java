package PracticeExamples;

public class BankAccount {
	int accountnumber;
	float balance;
	
	void deposit(int accountnumber, float balance)
	{
		this.accountnumber=accountnumber;
		this.balance=balance;
		
		System.out.println(this.accountnumber+ " "+ this.balance);
	}
	void withdraw(float balance)
	{
		this.balance=balance;
		
	}
	// Practice examples 
	
	

}
