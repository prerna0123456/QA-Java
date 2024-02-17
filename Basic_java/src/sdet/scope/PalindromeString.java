package sdet.scope;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check if it's a palindrome: ");
		String str=sc.nextLine();
		String rev=new String();
		
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			System.out.println("String is a palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
		
	}

}
