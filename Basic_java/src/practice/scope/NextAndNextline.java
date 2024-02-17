package practice.scope;

import java.util.Scanner;

public class NextAndNextline {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String s1=sc.next();
		System.out.println("Output of s1: "+ s1);
		
		System.out.println("Enter second name: ");
		String s2=sc.nextLine();
		System.out.println("Output of s2: "+ s2);
		
		System.out.println("Enter third name: ");
		String s3=sc.nextLine();
		System.out.println("Output of s2: "+s2+ " & output of s3: "+ s3);
	}

}
