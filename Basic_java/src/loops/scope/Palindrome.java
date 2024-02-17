package loops.scope;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int num=sc.nextInt();
		int temp1=0;
		int temp2=num;
		while(num>0) {
			temp1=temp1+num%10;
			num=num/10;
			if(num>0)
				temp1=temp1*10;
		}
		if(temp2==temp1)
			System.out.println("It's a palindrome");
		else
			System.out.println("Not a palindrome");
	}

}
