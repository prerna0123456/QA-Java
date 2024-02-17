package homework.sessions;

import java.util.Scanner;

public class SessionFiveHW {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Which opertaion you want to perform: +,-,*,/");
		char op=sc.next().charAt(0);
		Operation o=new Operation();
		
		switch(op) {
		case '+':
			System.out.println(Operation.add(a, b));
			break;
		case '-':
			System.out.println(Operation.sub(a, b));
			break;
		case '*':
			System.out.println(o.multi(a, b));
			break;
		case '/':
			System.out.println(o.div(a, b));
			break;
		default:
		}
		
		
		
	}

}
