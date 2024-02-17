package classes.eight;

public class ScientificCalculator implements Calculator {

	@Override
	public int sum(int a, int b) {

		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}

	@Override
	public int square(int a) {
		return a * a;
	}

	@Override
	public double random() {
		return Math.random();
	}

}
