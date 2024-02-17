package methods.scope;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String str = sc.nextLine();

		StringMethod sm = new StringMethod();
		String newStr = sm.reverseString(str);
		System.out.println("Reversed string is: " + newStr);
		
		System.out.println("----------------------------------------------------");
		
		
		newStr=sm.reverseBuilder(str);
		System.out.println(newStr);

	}

	String reverseString(String str) {

		String newStr = new String();

		for (int i = str.length() - 1; i >= 0; i--) {
			newStr = newStr + str.charAt(i);
		}

		return newStr;

	}
	
	public String reverseBuilder(String str) {
		
		StringBuffer sb=new StringBuffer(str);
		return sb.reverse().toString();
	}
}
