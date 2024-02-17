package classes.six;

import java.util.Arrays;

public class NoCloneCopyArray {

	public static void main(String[] args) {
		
		int[] arr = {1,45,85,74,63,78};
		int[] copy = new int[arr.length];
		
		for(int i=0;i<arr.length; i++) {
			copy[i]=arr[i];
			
		}
		System.out.println("Old array "+ Arrays.toString(arr));
		System.out.println("New array "+ Arrays.toString(copy));
	}

}
