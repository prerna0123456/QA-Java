package homework.sessions;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GenRandom {
	
	int rand(int n) {
		int[] num=new int[500];
		int sm=0;
		for (int i=0;i<500;i++) {
			Random r=new Random();
			num[i] = r.nextInt(901)+100;
			
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		sm=num[n-1];
		return sm;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Let me find nth smallest number. Enter value of n");
		int n=sc.nextInt();
		GenRandom gr=new GenRandom();
		System.out.println("nth smallest number is: "+gr.rand(n));
		
		
	}

}
