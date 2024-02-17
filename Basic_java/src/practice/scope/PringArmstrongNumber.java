package practice.scope;

import java.util.Scanner;

public class PringArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,pow=1,temp,add,count,n;
		System.out.println("Enter till which number armstrong number needs to be printed");
		num=sc.nextInt();
		for(int i=0; i<=num; i++) {
			temp=i;
			//finding number of digits
			count=0;
			while(temp>0) {
				temp=temp/10;
				count++;
			}
			temp=i; 	//resetting temp tp num
			add=0;
			
			//calculating power of each digit
			while(temp>0) {
				n=temp%10;
				pow=1;
				for(int j=1;j<=count; j++) {
					pow=pow*n;
				}
				add=add+pow;
				temp=temp/10;
			}
			if(add==i) {
				System.out.println(add);
			}
			
		}
		
	}

}
