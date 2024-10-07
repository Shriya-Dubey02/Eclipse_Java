package abstraction;

abstract class Electronics
{
	abstract void start();
	abstract void stop();
}

class TV extends Electronics
{
	void start()
	{
		System.out.println("TV started");
	}
	
	void stop()
	{
		System.out.println("TV stopped");
	}
}

class AC extends Electronics
{
	// compulsory class
	void start()
	{
		System.out.println("AC started");
	}
	
	void stop()
	{
		System.out.println("AC stopped");
	}
}



public class AbstractionExample1 {
	public static void main(String[] args) {
		
		new TV().start();
		new AC().start();
		new TV().stop();
		new AC().stop();
		// Anonymous Inner class
		Electronics electr=new Electronics()
		{
			void start()
			{
				System.out.println("Speaker start");
			}
			
			void stop()
			{
				System.out.println("Speaker stop");
			}
		};
		electr.start();
		electr.stop();
		
	}

}
