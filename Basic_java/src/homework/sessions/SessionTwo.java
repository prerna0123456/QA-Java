package homework.sessions;

import java.util.Scanner;

public class SessionTwo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = input.nextLine();
		
		System.out.println("What is your age?");
		int age=input.nextInt();
		
		input.nextLine();
		System.out.println("What is your gender (Male/Female)?");
		String gen = input.nextLine();
		
		System.out.println("Where are you from?");
		String oldLoc=input.nextLine();
		
		System.out.println("Where do you live now?");
		String currentLoc= input.nextLine();
		
		System.out.println("Where do you work?");
		String work = input.nextLine();
		
		System.out.println("What is your job role?");
		String jobRole = input.nextLine();
		
		System.out.println("What is your salary?");
		Double salary = input.nextDouble();
		
		System.out.println("How much raise are you getting next year?");
		Double raise = input.nextDouble();
		
		
		
		
		Double newSalary=salary+raise;
		
		System.out.println("My name is "+name+". I am "+age+" years old, " + gen +". I work at "+ 
							work+" as "+ jobRole+". I currently live in "+currentLoc+". I am "
									+ "originally from "+ oldLoc+". I make "+ salary+" dollars."
											+ " I will get "+raise+" as annual raise so my total salary"
													+ " would be "+newSalary+" dollars next year.");
		
		
	}

}
