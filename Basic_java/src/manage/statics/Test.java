package manage.statics;

public class Test {
	
	static double sv=2.0;
	
	double nsv=22.0;

	public static void display(String str) {
		System.out.println(str);
	}
	
	void calculateSquare(int n) {
		System.out.println("In calculate square function");
		System.out.println(n*n); 
			
	}
	
	void square(int n) {
		System.out.println("In square function");
		calculateSquare(n);
	}
}
