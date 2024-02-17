package sdet.scope;

import java.util.Scanner;

//Print Fibonacci series until a given number

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter when to end a fibonacci series ");
		int lastNum = sc.nextInt();
		int num1=0;
		int num2=1;
		while(num1<lastNum) {
			System.out.print(num1 +" ");
			int temp = num1 + num2;
			num1=num2;
			num2=temp;
		}
		sc.close();
		
		
	}

}
