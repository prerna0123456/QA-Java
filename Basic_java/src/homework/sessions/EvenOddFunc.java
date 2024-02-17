package homework.sessions;

import java.util.Scanner;

public class EvenOddFunc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		EvenOddFunc f=new EvenOddFunc();
		boolean b=f.checkEvenOdd(num);
		if(b) {
			System.out.println("You entered even number");
		}
		else {
			System.out.println("You entered odd number");
		}
		
	}
	
	boolean checkEvenOdd(int n) {
		if(n%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
