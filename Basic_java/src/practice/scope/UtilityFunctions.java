package practice.scope;

public class UtilityFunctions {

	public static void main(String[] args) {
	
		String test = "Welcome to Jumanji";
		
		System.out.println(test.isEmpty());
		System.out.println(test.startsWith("Wel"));
		System.out.println(test.endsWith("Jumanji"));
		
		int pos = test.indexOf("come");
		System.out.println(pos);
		
		String s1="Core Java";
		String s2="OOPS Fundamentals";
		String s3="core java";
		
		System.out.println("s1=s2: "+ s1.equals(s2));
		System.out.println("s1=s3: "+ s1.equals(s2));
		System.out.println("ignore cases1=s3: "+ s1.equalsIgnoreCase(s3));
		
	}

}
