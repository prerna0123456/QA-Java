package practice.scope;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		
		int u = sc.nextInt();
		
		if(u%2==0) {
			System.out.println("You entered even number");
		}
		else {
			System.out.println("You entered odd number");
		}
		
		
	}

}
