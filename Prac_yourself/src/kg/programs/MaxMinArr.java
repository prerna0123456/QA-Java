package kg.programs;

public class MaxMinArr {

	public static void main(String[] args) {
		int[] a= {12,47,458,741,65,1,45,36,75};
		int max = 0,min;
		for(int i=0;i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		min=max;
		for(int j=0;j<a.length; j++) {
			if(a[j]<min) {
				min=a[j];
			}
		}
		System.out.println("Max in the array: "+max+"\nMin in an array: "+min);
	}

}
