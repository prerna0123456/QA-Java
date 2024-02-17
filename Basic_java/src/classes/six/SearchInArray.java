package classes.six;

import java.util.Scanner;

public class SearchInArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] num = {2,55,78,65,45,78,69,12,79,55,65,12,55};
		System.out.println("Enter a number to find");
		int value = sc.nextInt();
		boolean isFound = false;
		
		for(int k=0; k<num.length; k++) {
			if(value==num[k]) {
				System.out.println("Value found at index: "+ k);
				isFound = true;
			}
			
				
		}
		
		if(isFound==false) {
			System.out.println("Number not found in array");
		}
		
	}

}
