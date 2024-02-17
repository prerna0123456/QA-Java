package seven.cls;

public class MethodChaining {

	public static void main(String[] args) {
		MethodChaining m = new MethodChaining();
		System.out.println(m.sum(2, 3.3));
	}

	double sum(int x, int y) {
		System.out.println("2 int");
		return sum(x,y,x+y);
	}

	double sum(int x, double y) {
		System.out.println("1 int, 1 double");
		return sum(x,(int)y);

	}

	double sum(int x, int y, int z) {
		System.out.println("3 arg");
		return x + y + z;
	}
}
