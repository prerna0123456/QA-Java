package classes.seven;

public class AbstractDemo extends AbstractB {

	public static void main(String[] args) {
		
		AbstractDemo d=new AbstractDemo(); //Only AbstractDemo can be instantiated,
											//AbstractA & AbstractB are abstract classes so can't be instantiated
		d.a();
	}
	
	//Since this class is not abstract and inherting abstract classes, it has to implement abstract methods
	public void a() {
		System.out.println("Overriding abstract method from Abstract A");
	}

}
