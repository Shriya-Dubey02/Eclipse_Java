package GenericsAndFunctionalInterfaces;

import java.util.function.Consumer;

public class Example5 {
	public static void main(String[] args) {
		
		Consumer<Integer> table= new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				int i;
				for(i=1;i<=10;i++)
				{
					System.out.println(i*t);
				}
				
			}
		};
		table.accept(10);
	}

}
