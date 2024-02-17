package practice.scope;

public class CalculateSum {

	public static void main(String[] args) {
		
		double[] num = {2.2,5.6,7.1,6.1,4.5,6.2,4.5,8.9};
		double total=0;
		for (int i=0; i<num.length; i++)
		{
			total = total + num[i];
		}
		System.out.println("Sum of numbers in array is "+ total);

	}

}
