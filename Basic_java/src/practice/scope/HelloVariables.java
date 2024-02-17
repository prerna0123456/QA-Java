package practice.scope;

public class HelloVariables {

	public static void main(String[] args) {
		int a1=3;
		long a2=223344L;
		
		System.out.println(a1);
		System.out.println(a2);
		
		a2=a1;// storing int to long
		
		System.out.println(a2);
		

	}

}
