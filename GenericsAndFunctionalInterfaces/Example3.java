package GenericsAndFunctionalInterfaces;
import java.util.function.Predicate;

import encapsulation.Student;


public class Example3 {
	public static void main(String[] args) {
		
		Predicate<Student> checkAge= new Predicate<Student>()
				{ 
			@Override
			public boolean test(Student t) {
				// TODO Auto-generated method stub
				return t.getAge()>=18;
			}
			
				};
				
				Student obj1=new Student(101,"Shriya",24);
				boolean ans= checkAge.test(obj1);
				System.out.println(ans);
	}

}
