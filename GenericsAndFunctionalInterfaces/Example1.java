package GenericsAndFunctionalInterfaces;

import java.util.function.Predicate;

public interface Example1 {
	public static void main(String[] args) {
		
		// Predicate is a functional interface and lambda can be used for it
		// Anonymous inner class

		Predicate<Integer> isEven= new Predicate<Integer>() {
			public boolean test(Integer t) {
				return t%2==0;
			}
		};
		
		boolean ans = isEven.test(6);
		System.out.println(ans);
	}

}
