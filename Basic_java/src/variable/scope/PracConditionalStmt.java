package variable.scope;

import java.util.Arrays;

public class PracConditionalStmt {

	public static void main(String[] args) {
		
		/*int person_age=5;
		if(person_age>=18)
		{
			System.out.println("Eligible to vote");
			
		}
		else
		{
			System.out.println("Not eligible to vote");
		}*/
		//find odd or even number
		/*int x=21;  
		if (x%2==0)
			System.out.println("x is an even number");
		else
			System.out.println("x is an odd number");
			*/
		//check a number is positive, negative or zero
		
		/*int x=0;
		if(x>0)
			System.out.println("x is a positive number");
		else if(x==0)
			System.out.println("x is equal to zero");
		else
			System.out.println("x is a negative number");
			*/
		
		//Largest of 3 numbers
		/*
		int a=14,b=7,c=11;
		if(a>b && a>c)
			System.out.println("a is the largest number");
		else if (b>c && b>a)
			System.out.println("b is the largest number");
		else
			System.out.println("c is the largest number");
		*/
		
		//find day of the week
		/*
		int day_no=9;
		
		if (day_no==1)
			System.out.println("Sunday");
		else if (day_no==2)
			System.out.println("Monday");
		else if (day_no==3)
			System.out.println("Tuesday");
		else if (day_no==4)
			System.out.println("Wednesday");
		else if (day_no==5)
			System.out.println("Thursday");
		else if (day_no==6)
			System.out.println("Friday");
		else if (day_no==7)
			System.out.println("Saturday");
		else
			System.out.println("Invalid day number");
			*/
		
		//find day of the week using switch case
		
		int day_no=6;
		switch(day_no)
		{

		case 1: System.out.println("Sunday");
		break;
		case 2: System.out.println("Monday");
		break;
		case 3: System.out.println("Tuesday");
		break;
		case 4: System.out.println("Wednesday");
		break;
		case 5: System.out.println("Thursday");
		break;
		case 6: System.out.println("Friday");
		break;
		case 7: System.out.println("Saturday");
		break;
		default: System.out.println("Invalid day number");
		
		}
	}

}
