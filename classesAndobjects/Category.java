package classesAndobjects;

public class Category {
	int categoryId;
	String categoryName;
	
	// Constructor is called here
	Category()
	{
		System.out.println("Constructor");
	}
	
	Category(int categoryId, String categoryName)
	{
		this.categoryId=categoryId;
		this.categoryName=categoryName;
	}

}
