package classesAndobjects;

public class Student {
	int stud_id;
	String name;
	int roll_no;
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("non-paramaterized");
	}

	Student(int stud_id, String name, int roll_no) {
	
		this.stud_id = stud_id;
		this.name = name;
		this.roll_no = roll_no;
	}
	
	void setStudentdetails(int stud_id,String name,int roll_no) {
		this.name=name;
		this.roll_no=roll_no;
		this.stud_id=stud_id;
		
		System.out.println(this.name+" "+this.roll_no+" "+this.stud_id);
	}
	

}
