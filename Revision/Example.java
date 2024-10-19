package Revision;
@FunctionalInterface

interface I2{
	void apply();
}

public class Example {
	public static void main(String[] args) {
		
		I2 i=new I2() {
			public void apply()
			{
				System.out.println("Anonymous Inner class example");
			}
			
		};
		i.apply();
		
		I2 j=()-> System.out.println("Apply method from I2(Lambda)");
		j.apply();
	}

}
