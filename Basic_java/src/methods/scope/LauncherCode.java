package methods.scope;

import java.util.Scanner;

public class LauncherCode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String str=sc.nextLine();
		
		
		StringMethod sm=new StringMethod();
		String rev=sm.reverseString(str);
		System.out.println(rev);
		
	}

}
