package practice.scope;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number");
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
	}

}
