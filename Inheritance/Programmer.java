package Inheritance;


// Hybrid Inheritance
// Multiple inheritance not allowed in java through classes
public class Programmer extends FulltimeEmployee {
	
	String programming_language;

	public Programmer(int id, String name, int monthlySalary, int noOfLeaves, int insurance,
			String programming_language) {
		super(id, name, monthlySalary, noOfLeaves, insurance);
		this.programming_language = programming_language;
	}

}
