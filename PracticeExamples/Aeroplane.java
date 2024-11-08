package PracticeExamples;

public class Aeroplane implements Movable,Flyable {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Aeroplane flying");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Moving");
		
	}
	
	public static void main(String[] args) {
		
		new Aeroplane().fly();
		new Aeroplane().move();
		new Vehicle1().printMove();
		new Vehicle1().printFly();
	}
	
	

}
