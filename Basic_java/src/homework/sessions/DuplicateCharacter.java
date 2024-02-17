package homework.sessions;

import java.util.Scanner;

public class DuplicateCharacter {
	
	public String dupChar(String str) {
		String s="";
		char[] temp=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(temp[i]==temp[j]) {
					if(s.contains(String.valueOf(temp[i]))) {
						break;
					}
					s=s+temp[i]+" ";
					break;
				}
			}
		}
		return s;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		DuplicateCharacter d= new DuplicateCharacter();
		System.out.println(d.dupChar(s));
		
	}

}
