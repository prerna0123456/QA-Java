package classes.six;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a day number");
		int n = sc.nextInt();
		switch (n) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("It's a weekday");
			break;

		case 6:
		case 7:
			System.out.println("It's a weekend");
			break;
		default:
			System.out.println("Not a valid day number");

		}

	}

}
