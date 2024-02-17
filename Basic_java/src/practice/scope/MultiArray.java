package practice.scope;

public class MultiArray {

	public static void main(String[] args) {
		//declaring 2 dimensional array
		int[][] a = { {100,200},
						{300,400},
						{500,600},
		};
		
		// enhanced for loop
		
		for (int arr[]:a)
		{
			for (int x:arr)
			{
				System.out.print(" "+x);
			}
			System.out.println();
		}
		
		}
		
		
	}


