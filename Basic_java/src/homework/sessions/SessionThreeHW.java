package homework.sessions;

import java.util.Scanner;
public class SessionThreeHW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String userInput=sc.nextLine();
		String formattedInput = userInput.toUpperCase();
		System.out.println("Here is what you entered in upper case "+ formattedInput);
		System.out.println("Here is the length of user input: "+ userInput.length());
		String replacedInput=formattedInput.replace('O', 'Z');
		System.out.println("Here is 'o' replaced with 'z': "+ replacedInput);
		System.out.println("Here is the last character: "+replacedInput.charAt(replacedInput.length()-1));
		System.out.println("Here is the string concatenated to 'test' "+ userInput.concat(" Test"));
	}

}
