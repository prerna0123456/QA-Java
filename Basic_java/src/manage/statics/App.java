package manage.statics;

public class App {

	public static void main(String[] args) {
		
		Test.display("hello");
		Test t1=new Test();
		t1.calculateSquare(3);
		
		Test t2=new Test();
		t1.sv=3.0;
		System.out.println(t2.sv); //Static variable gets affected with changing any of the objects
		
		t1.nsv=33.0;
		System.out.println(t2.nsv); //non-static doesn't get affected with making changes in any other object
		
		t1.square(11);
	}

}
