package abstraction;

public interface Bank {
	void details();
	void address();
	
	// In interface default methods are allowed
	
	default void methodBank()
	{
		System.out.println("Default method");
	}
	
	// Static method is allowed
	// static method can be directly called by interface name
	static void staticmethod()
	{
		System.out.println("Static method");
	}

}
