package PracticeExamples;

class Employee{
	int empId;
	float salary;
	
	Employee()
	{
		System.out.println("constructor 1");
	}
	Employee(int empId,float salary)
	{
		this.empId=empId;
		this.salary=salary;
	}
}

class Programmer extends Employee{
	int bonus;
	
	Programmer()
	{
		System.out.println("constructor 2");
	}
	
	Programmer(int empId,float salary,int bonus)
	{
		super(empId,salary);
		this.bonus=bonus;
		System.out.println(empId+" "+salary+" "+ (salary+2000));
		
	}
}




	


