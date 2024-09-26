package Inheritance;

class FulltimeEmployee extends Employee {
	int noOfLeaves;
	int insurance;
	
	FulltimeEmployee(int id,String name,int monthlySalary, int noOfLeaves,int insurance)
	{
		super(id,name,monthlySalary);
		this.noOfLeaves=noOfLeaves;
		this.insurance=insurance;
		System.out.println(id+" "+name+" "+monthlySalary+" "+
			noOfLeaves+" "+insurance);
	}
	

}
