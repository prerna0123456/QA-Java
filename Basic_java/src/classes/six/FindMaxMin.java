package classes.six;

public class FindMaxMin {

	public static void main(String[] args) {

		int[] arr = { 11, 23, 55, 78, 41, 36, 41, 74, 111,125 };

		int max = 0;
		int min = 0;

		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}

		}
		min = max;

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Greatest number in array is: " + max + " and smallest number is: " + min);
	}

}
