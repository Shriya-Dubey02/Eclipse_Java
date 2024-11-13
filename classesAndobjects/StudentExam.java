package classesAndobjects;

public class StudentExam {
	public static void main(String[] args) {
		
		Student s1=new Student(101,"Shriya",1011);
		System.out.println(s1.name);
		System.out.println(s1.roll_no);
		
		Student s2= new Student();
		s2.setStudentdetails(102, "Riya", 1022);
	}

}
