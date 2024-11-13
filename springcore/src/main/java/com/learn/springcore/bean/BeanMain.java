 dpackage com.learn.springcore.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanMain {
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
		Student stud= context.getBean("s1",Student.class);
		System.out.println(stud);
		
		System.out.println(context.getBean("school1",School.class));
		System.out.println(context.getBean("school2",School.class));
	}
	

}
