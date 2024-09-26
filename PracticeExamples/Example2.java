package PracticeExamples;

class Animals {
	String animal_name;
	String color;
	Animals()
	{
		System.out.println("non para");
	}
	
Animals(String animal_name,String color)	
{
	this.animal_name=animal_name;
	this.color=color;
}

}

class Dog extends Animals{
	String type;
	
	/*Dog(){
		System.out.println("Non parameterized");
	}*/
	
	Dog(String animal_name,String color,String type)
	{
		super(animal_name,color);
		this.type=type;
		System.out.println(animal_name+" "+color+" "+type);
		
	}
	
}
