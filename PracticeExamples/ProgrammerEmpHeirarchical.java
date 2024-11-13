package PracticeExamples;

public class ProgrammerEmpHeirarchical extends HeirarchicalCompany{
	int bonus;
	String achieve;
	ProgrammerEmpHeirarchical(int emp_id,String emp_name,int salary,int bonus,String achieve) {
		// TODO Auto-generated constructor stub
		super(emp_id, emp_name, salary);
		this.bonus=bonus;
		this.achieve=achieve;
		System.out.println(emp_id+" "+emp_name+" "+salary+" "+bonus+" "+achieve);
	}

}
