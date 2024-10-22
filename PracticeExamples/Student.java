package PracticeExamples;

public class Student {
	
	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	
	void setStudentDetails(int rollNum,String studName,int mark1,int mark2,int mark3)
	{
		this.rollNum= rollNum;
		this.studName=studName;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		
		System.out.println(rollNum+" "+studName+" "+mark1+" "+mark2+" "+mark3);
		
	}
	
	void calculateTotal()
	{

		totalMarks= mark1+mark2+mark3;
	}
	
	public void displayStudDetails()
	{
		System.out.println("Roll no is: "+rollNum);
		System.out.println("Sudent name is: "+studName);
		System.out.println("Total Marks is: "+totalMarks);
	}

}
