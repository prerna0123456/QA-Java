package classes.nine;

public class WrapperClassesNum {

	public static void main(String[] args) {
		
		String s1="123";
		String s2="&12";
		
		Integer i1= Integer.parseInt(s1);
		Integer i2=0;
		System.out.println(i1);
		try {
			i2=Integer.parseInt(s2);
			
		}
		catch(NumberFormatException ne) {
			System.out.println("catch in number format");
		}
		System.out.println(i2);
		
	}

}
