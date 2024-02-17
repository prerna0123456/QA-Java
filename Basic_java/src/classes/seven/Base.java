package classes.seven;

public class Base {

	int a=1;

	public int b=2;

	private int c=3;

	protected int d=4;

	void display() {
		System.out.println("base");
		System.out.println(a);
	}

	public void pub() {
		System.out.println("public method \n" + b);
	}

	private void pri() {
		System.out.println("private method \n" + c);
	}

	protected void pro() {
		System.out.println("protected method \n" + d);
	}
}
