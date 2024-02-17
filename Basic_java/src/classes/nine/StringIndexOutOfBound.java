package classes.nine;

public class StringIndexOutOfBound {

	public static void main(String[] args) {
		String str = "hello";
		try {
			System.out.println(str.charAt(10));

		} catch (StringIndexOutOfBoundsException sb) {
			System.out.println("Catch block");
		}
	}

}
