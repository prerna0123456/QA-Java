package kg.programs;

import java.util.Scanner;

public class ElemInArr {

	public static void main(String[] args) {
		int[] a= {12,22,45,65,35,41,89,12,45,74,14,56};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find: ");
		int find=sc.nextInt();
		int count=0;
		for(int i:a) {
			if(find==i)
				count++;
			
		}
		System.out.println("Number of times "+find+" apperared in array is: "+count);
	}

}
