package classes.nine;

public class TestException {

	public static void main(String[] args) {
		
		int x=0;
		int y=3;
		int z;
		
		try {
			
			z=y/x;
			
		}
		catch(ArithmeticException ae){
			
			System.out.println("catch block");
			
		}
		
	}

}
