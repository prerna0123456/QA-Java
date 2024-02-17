package loops.scope;

import java.util.Scanner;
public class ReverseNumber {

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
		System.out.println("Reverse of "+ temp2+" is "+ temp1);
		
		//Can be reversed using StringBulder & StringBuffer classes as well
		//StringBuffer
		/*
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println("Reverse of "+ num+" is "+rev);
		*/	
		
		
			
		//StringBuilder
		/*
		StringBuilder sbl= new StringBuilder();
		sbl.append(num);
		sbl.reverse();
		System.out.println("Reverse of "+ num+" is "+sbl);
		*/
		
		}

}
