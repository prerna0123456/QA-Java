package practice.scope;
import java.util.Scanner;

public class Exercise1 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		int userInput=sc.nextInt();
		if(userInput>=18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
	}
}
