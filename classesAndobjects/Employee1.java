package classesAndobjects;

public class Employee1 {
	int empId;
	String empName;
	static String ceo="Shriya";
	
	Employee1(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	
	// static method
	static void changeCeo(String ceoName)
	{
		ceo=ceoName;
	}

}
