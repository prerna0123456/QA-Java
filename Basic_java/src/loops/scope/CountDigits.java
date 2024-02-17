package loops.scope;

import java.util.Scanner;
//Count number of digits in any given number
public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a large number to count it's digits ");
		int num = sc.nextInt();
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		System.out.println("Number of digits in your number is: "+count);
	}

}
