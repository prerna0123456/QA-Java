package sdet.scope;

import java.util.Scanner;
public class ReverseAString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String str=sc.nextLine();
		String newStr=new String();
		
		//using concat function
		/*for(int i=str.length()-1; i>=0; i--) {
			System.out.print(newStr.concat(String.valueOf(str.charAt(i))));
			
		}*/
		
		//using + to concat string
		/*for(int i=str.length()-1; i>=0; i--) {
			newStr=newStr+str.charAt(i);
		}
		System.out.println("Reversed string is: "+newStr);
		*/
		
		//using character array
		/*char[] a = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--) {
			newStr=newStr+a[i];
		}
		System.out.println("Reversed string is: "+newStr);
		*/
		
		//using StringBuffer Class
		StringBuffer sb=new StringBuffer(str);
		StringBuffer newStr1=sb.reverse();
		System.out.println("Reversed string is: "+newStr1);
	}

}
