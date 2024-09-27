package polymorphism;

public class CalculatorMain {
	public static void main(String[] args) {
		
		Calculator c1=new Calculator();
		c1.add(2,7);
		c1.add(2.94f, 4.35f);
		c1.add(12, 90, 10);
		c1.add(25, 30.6f);
		
		c1.substr(25.8f, 10.6f);
		
		c1.multip(2.5f, 4);
	}

}
