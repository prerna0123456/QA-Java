package sdet.scope;

public class SwapANumber {

	public static void main(String[] args) {

		int a=12;
		int b=56;
		System.out.println("Before reversing: a= "+a+" & b= "+b);
		
		//using third variable
		/*
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After reversing: a= "+a+" & b= "+b);
		*/
		
		//using + & -
		/*
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After reversing: a= "+a+" & b= "+b);
		*/
		
		//using * & /
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After reversing: a= "+a+" & b= "+b);

		
		
	}

}
