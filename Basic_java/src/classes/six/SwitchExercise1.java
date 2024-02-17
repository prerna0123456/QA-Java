package classes.six;

import java.util.Scanner;


public class SwitchExercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter what operation you want to perform");
		String op=sc.next();
		int temp;
		
		switch(op) {
		case "+":
			temp=a+b;
			System.out.println("Sum of the numbers is: "+ temp);
			break;
		case "-":
			temp=a-b;
			System.out.println("Sum of the numbers is: "+ temp);
			break;
		case "/":
			temp=a/b;
			System.out.println("Sum of the numbers is: "+ temp);
			break;
		case "*":
			temp=a*b;
			System.out.println("Sum of the numbers is: "+ temp);
			break;
		default:
			System.out.println("Please enter a valid operator");
		}
	}

}
