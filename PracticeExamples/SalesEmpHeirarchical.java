package PracticeExamples;

public class SalesEmpHeirarchical extends HeirarchicalCompany {
	int incentives;
	
	SalesEmpHeirarchical(int emp_id,String emp_name,int salary,int incentives) {
		// TODO Auto-generated constructor stub
		super(emp_id, emp_name, salary);
		this.incentives=incentives;
		System.out.println(emp_id+emp_name+salary+incentives);
		
	}
	
	

}
