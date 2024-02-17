package homework.sessions;

import java.util.Scanner;

import methods.scope.StringMethod;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String str = sc.nextLine();
		
		CheckPalindrome cp=new CheckPalindrome();
		boolean b=cp.isPalindrome(str);
		if(b) {
			System.out.println("You entered a palindrome");
		}
		else {
			System.out.println("You didn't eneter a palindrome");
		}
		
	}
	
	boolean isPalindrome(String s) {
		StringMethod sm = new StringMethod();
		String newStr = sm.reverseBuilder(s);
		if(newStr.equals(s)) {
			return true;
			}
		else {
			return false;
			}
	}

}
