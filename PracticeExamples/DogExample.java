package PracticeExamples;

public class DogExample {
	
	String name;
	String dog_breed;
	int age;
	String color;
	
	public void Bark(String name,String dog_breed,int age,String color) {
		this.name=name;
		this.dog_breed=dog_breed;
		this.age=age;
		this.color=color;
		
		System.out.println("Hi! I am a dog and my name is: "+name+" My breed is "+dog_breed+" My age is "+age+" My color is: "+color);
		
	}
	
	
	public void Sleep(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println(name+" "+age);
	}
	
	
	public void Eat(String name,String color) {
		this.name=name;
		this.color=color;
		System.out.println(name+" "+color);
	}

}
