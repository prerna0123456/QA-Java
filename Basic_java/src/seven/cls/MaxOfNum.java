package seven.cls;

public class MaxOfNum {

	public static void main(String[] args) {
		MaxOfNum m = new MaxOfNum();
		System.out.println(m.max(45, 89));
		System.out.println(m.max(2.3, 7.98));
		System.out.println(m.max(4, 3.99));
	}

	double max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

	double max(int x, double y) {
		if (x > y)
			return x;
		else
			return y;
	}

	double max(double x, double y) {
		if (x > y)
			return x;
		else
			return y;
	}
}
