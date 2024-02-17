package seven.cls;

public class MethodOverload {

	public static void main(String[] args) {
		MethodOverload m = new MethodOverload();
		System.out.println(m.sum(2,4));
		System.out.println(m.sum(2,4.5));
		System.out.println(m.sum(2,4,1));
		
	}
	
	double sum(int x, int y) {
		return x+y;
	}
	double sum(int x, double y) {
		return x+y;
		
	}	
	double sum(int x, int y, int z) {
		return x+y+z;
	}

}
