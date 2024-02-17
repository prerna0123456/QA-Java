package classes.six;

import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		int[] numbers = {3, 5, 7, 11};
		int[] copy;
		copy = numbers;
		System.out.println("Original Array: "+Arrays.toString(numbers));
		System.out.println("Copied Array: "+ Arrays.toString(copy));
		
		numbers[1]=45;
		System.out.println("Original Array after change: "+Arrays.toString(numbers));
		System.out.println("Copied Array after change: "+ Arrays.toString(copy));
		
		int[] clonedNumbers = numbers.clone();
		System.out.println("Original Array: "+Arrays.toString(numbers));
		System.out.println("Cloned Array: "+ Arrays.toString(clonedNumbers));
		
		numbers[1]=125;
		System.out.println("Original Array after change: "+Arrays.toString(numbers));
		System.out.println("Cloned Array after change: "+ Arrays.toString(clonedNumbers));
		
		
	}

}
