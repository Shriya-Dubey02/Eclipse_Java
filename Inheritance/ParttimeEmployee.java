package Inheritance;

public class ParttimeEmployee extends Employee {
	int bonus;
	
	ParttimeEmployee(int id,String name,int monthlySalary,int bonus)
	{
		super(id,name,monthlySalary);
		this.bonus=bonus;
		System.out.println(this.id+" "+this.name+" "+this.monthlySalary+" "+this.bonus);
	}
}