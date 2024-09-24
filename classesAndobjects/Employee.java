package classesAndobjects;

public class Employee {
	int employeeId;
	String employeeName;
	int salary;
	
	void setEmployeeDetails(int employeeId,String employeeName,int salary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		System.out.println(this.employeeId+" "+
		              this.employeeName+" "+
				this.salary);
	}

}
