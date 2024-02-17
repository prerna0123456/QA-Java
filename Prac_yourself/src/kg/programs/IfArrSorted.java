package kg.programs;

import java.util.Arrays;

public class IfArrSorted {

	public static void main(String[] args) {
		int[] a= {10,45,55,74,85};
		int[] b=new int[5];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		if(Arrays.equals(a,b))
			System.out.println("Array is sorted");
		else
			System.out.println("Array is not sorted");
		
		
	}

}
