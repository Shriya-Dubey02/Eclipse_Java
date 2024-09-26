package PracticeExamples;

class Vehicle {
	String name;
	int vnumber;
	String color;
	
	
	Vehicle(String name,int vnumber,String color)
	{
		this.name=name;
		this.vnumber=vnumber;
		this.color=color;
	}

}

class Car extends Vehicle{
	String type;
	
	Car(String name,int vnumber,String color,String type){
		super(name,vnumber,color);
		this.type=type;
		
		System.out.println(name+" "+vnumber+" "+color+" "+type);
	}
}
