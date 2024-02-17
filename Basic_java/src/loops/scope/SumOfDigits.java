package loops.scope;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a large number to count it's digits ");
		int num = sc.nextInt();
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of digits is: "+sum);
	}

}
