package practice.scope;

import java.util.Scanner;

public class CheckArmstrongNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it's Armstrong number");
		int num = sc.nextInt();
		
		int temp=num;
		int count=0;
		int add =0;
		int digit;
		int pow=1;
		
		while(temp>0) {
			temp=temp/10;
			count++;
		}
		
		temp=num;
		while(temp>0) {
			digit=temp%10;
			pow=1;
			for(int i=1; i<=count; i++) {
				pow=pow*digit;
				}
			add=add+pow;
			temp=temp/10;
		}
		
		if(add==num) {
			System.out.println("Entered number is Armsstrong number");
		}
		else {
			System.out.println("Entered number is not an Armsstrong number");
		}
		
		
	}

}
