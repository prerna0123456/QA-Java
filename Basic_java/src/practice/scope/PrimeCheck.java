package practice.scope;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int n = sc.nextInt();
		boolean b=false;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				b=true;
				break;
			}
		}
		if(b)
			System.out.println(n+ " is a not a Prime Number ");
		else
			System.out.println(n + " is a Prime Number");
		
	}

}
