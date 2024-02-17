package practice.scope;

import java.util.Scanner;

public class ChainingConditions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if (n >= 1 && n < 100) {
			System.out.println("Number is between 1 & 99");
		} else if (n >= 100 && n < 1000) {
			System.out.println("Number is between 100 & 999");
		} else if (n >= 1000 && n < 10000) {
			System.out.println("Number is between 1000 & 9999");
		} else {
			System.out.println("Number outside expected range");

			if (n <= 0) {
				System.out.println("Number is either zero or a -ve number");
			} else {
				System.out.println("Number is greater than 10000");
			}
		}
	}

}
