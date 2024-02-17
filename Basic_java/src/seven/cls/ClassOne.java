package seven.cls;

public class ClassOne {

	public static void main(String[] args) {
		ClassTwo c1=new ClassTwo(2,3);
	}

}

 class ClassTwo{
	int x;
	int y;
	public ClassTwo() {
		super();
		System.out.println("default constructor");
		}
	public ClassTwo(int x) {
		this();
		this.x = x;
		System.out.println("One Argument constructor");
		
	}
	public ClassTwo(int x, int y) {
		this(x);
		System.out.println("two argument constructor");
		this.x = x;
		this.y = y;
		
		
	}
	
}
