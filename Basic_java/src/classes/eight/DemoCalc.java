package classes.eight;

public class DemoCalc {

	public static void main(String[] args) {
		
		Calculator c= new ScientificCalculator();
		System.out.println(c.square(5));
		System.out.println(c.random());
		
	}

}
