package kg.programs;

public class SumAvgEleArr {

	public static void main(String[] args) {
		int[] a= {12,25,14,85,65,17};
		int sum=0;
		int len=a.length;
		
		for(int i:a) {
			sum=sum+i;
			
		}
		double avg=sum/len;
		System.out.println("Sum: "+sum+ "\nAvg: "+avg);
		
		
		
	}

}
