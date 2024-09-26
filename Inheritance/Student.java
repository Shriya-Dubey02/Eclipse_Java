package Inheritance;

public class Student {
	int rollNo;
	String name;
	int marks;
	
	
	Student()
	{
		System.out.println("non parameterized");
	}
	Student(int rollNo,String name,int marks)
	
	
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		
		System.out.println("Parameterized");
		
		
	}

}
class SportStudent extends Student{
	int graceMarks;
	String sportName;
	
	SportStudent(int rollNo,String name,int marks,int graceMarks,String sportName )
	
	{
		super(rollNo,name,marks);
		this.graceMarks=graceMarks;
		this.sportName=sportName;
		System.out.print(rollNo+" "+name+" "+marks+" "+graceMarks+" "+sportName);
	}
}



