package homework.sessions;

import java.util.Scanner;

public class SessionFour1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter till which number you want to print pattern: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i = i + 4) {
			if (i == 0)
				System.out.print(1);
			else
				System.out.print(" " + i);
		}

	}

}
