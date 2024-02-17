package loops.scope;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find even and odd digits in it: ");
		int num = sc.nextInt();
		int even=0;
		int odd=0;
		int temp=0;
		while(num>0)
		{
			temp=num%10;
			if(temp%2==0)
				even++;
			else
				odd++;
			num=num/10;
			
		}
		
		System.out.println("There are "+ even+" even digits in given number & "+odd+" odd digits.");
		
	}

}
