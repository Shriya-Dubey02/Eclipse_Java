package Learncollection;

// used for sorting
// public class Product implements Comparable<Product> {
public class Product{
	
	private int id;
	private String name;
	private int price;
	
	
	
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
	public int getPrice() {
		return price;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
	
	// current object- next object
	// @Override
//	public int compareTo(Product o) {
//		// TODO Auto-generated method stub
//		return this.name.compareTo(o.name);
		
		// id is getting sorted here
		// for string comparison use compareTo method
		// compareTo returns int , we cannot use startsWith
		// comparable can only work with one value

	
	
	
	
	
	
	
	


