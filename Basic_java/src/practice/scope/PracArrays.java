package practice.scope;

public class PracArrays {

	public static void main(String[] args) {
	
		int[] arg = new int[5];
		int[] arr = {1,2,3,4,5};
		int[] arr1= new int[4];
		
		arg[0]= 23;
		System.out.println(" first element "+arr[0]+ " "+arg[1]);
		System.out.println("Array length "+arg.length);
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.println("array value" + arr[i]);
		}
	
	}
	
}
