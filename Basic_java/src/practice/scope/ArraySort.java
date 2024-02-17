package practice.scope;

import java.util.*;

public class ArraySort {

	public static void main(String[] args) {
		int[] unsorted= {1,45,23,78,12,49};
		Arrays.sort(unsorted);
		System.out.println(Arrays.toString(unsorted));
		
		//reverse sorting
		String[] str= {"21","33","11","58"};
		Arrays.sort(str, Collections.reverseOrder());
		System.out.println(Arrays.toString(str));
		
		
		int[] n= {21,56,12,69};
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		
		
	}

}
