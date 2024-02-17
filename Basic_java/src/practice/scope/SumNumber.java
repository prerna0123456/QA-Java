package practice.scope;

import java.util.Scanner;

public class SumNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=input.nextInt();
		
		System.out.println("Enter second number: ");
		int b=input.nextInt();
		
		System.out.println("Sum of both numbers is " + (a+b));
				

	}

}
