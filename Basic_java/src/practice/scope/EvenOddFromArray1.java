package practice.scope;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddFromArray1{

	public static void main(String[] args) {
		
		int[] arr = {12,56,43,74,62,55,13,19,85,97,64};
		//using simple algorithm
		/*int[] even=new int[arr.length];
		int[] odd=new int[arr.length];
		int e=0,o=0;
		for(int i=0; i<arr.length; i++) {
		if(arr[i]%2==0) {
			even[e]=arr[i];
			e++;
		}
		else {
			odd[o]=arr[i];
			o++;
		}
		}
		
		System.out.println("Even numbers in given array are: "+Arrays.toString(even));
		System.out.println("Odd numbers in given array are: "+Arrays.toString(odd));
		*/
		
		//using ArrayList- to create dynamic array length
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				a.add(String.valueOf(arr[i]));
			}
			else {
				b.add(String.valueOf(arr[i]));
				
			}
			}
		System.out.println("Even numbers in given array are: "+a);
		System.out.println("Odd numbers in given array are: "+b);
		
	}

}
