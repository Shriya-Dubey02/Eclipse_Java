package encapsulation;


// POJO Class: It contains all the methods
public class Product {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// this class is overrided 
	public String toString()
	{
		return this.id+" "+this.name;
	}

}
