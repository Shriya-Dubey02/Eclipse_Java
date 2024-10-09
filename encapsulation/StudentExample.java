package encapsulation;

public class StudentExample {
	public static void main(String[] args) {
		Student s1= new Student();
		
		s1.setId(101);
		
		int id= s1.getId("s@1");
		if(id==0)
			System.out.println("Password is incorrect");
			
		System.out.println(id);
		
		s1.setName("Shriya");
		System.out.println(s1.getName());
		System.out.println(s1);
		
		s1.setAge(22);
		System.out.println(s1.getAge());
	}

}
