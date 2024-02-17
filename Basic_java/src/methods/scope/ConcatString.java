package methods.scope;

import java.util.Scanner;

public class ConcatString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first string");
		String s1= sc.nextLine();
		
		System.out.println("Please enter second string");
		String s2= sc.nextLine();
		
		ConcatString cs=new ConcatString();
		String newStr=cs.concatStr(s1, s2);
		
		System.out.println("Concatenated string is: "+newStr);
		
	}

	String concatStr(String a, String b) {
		
		String c= a+b;
		System.out.println("Length of new string is: "+c.length());
		return c;
		
	}
}
