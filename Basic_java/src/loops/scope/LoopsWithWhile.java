package loops.scope;

import java.util.Scanner;

public class LoopsWithWhile {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		int len=s1.length();
		int k = 0;
		String s2=s1.toUpperCase();
		
		while(k<len) {
			char temp=s2.charAt(k);
			k=k+1;
			if(temp=='Y')
				continue;
			System.out.print(s2.charAt(k-1)+" ");
		
			
		}
		
	}

}
