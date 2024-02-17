package practice.scope;

public class StringFunctions {

	public static void main(String[] args) {
		String s;
		String sample1 = new String("I am going to practice functions in this line");
		
		//String length
		System.out.println("Length of sample 1 is "+ sample1.length());
		
		//Return char value at given index location
		System.out.println("Char at location 0 is "+ sample1.charAt(0));
		
		//concat function
		String firstLine = "I am ";
		String secondLine = "example of concat function";
		System.out.println("Concat: "+ firstLine.concat(secondLine));
		
		//contains function
		boolean containsInSample = sample1.contains("going");
		System.out.println("sample 1 contains the word 'going', true or false? "+ containsInSample);
		
		//Check if a string starts with a given prefix: startsWith function
		String swSample= "Hello my name is Prerna";
		boolean sw = swSample.startsWith("Hello");
		System.out.println("Does your sample statement starts with 'Hello': "+ sw);
		
		//Check if a string ends with someting: endsWith function
		boolean ew=swSample.endsWith("Prerna");
		System.out.println("Does your sample ends with 'Prerna': "+ ew);
		
		//equals ignore case & equals
		s="welcome";
		System.out.println("Is s = Welcome: "+s.equalsIgnoreCase("Welcome"));
		System.out.println("Is s = Welcome:(if case sensitive) "+s.equals("Welcome"));
		
		//trim() remove spaces left & right of string
		String strim = "   welcome   ";
		System.out.println("Original string \""+ strim+"\" and after trimming \""+ strim.trim()+"\"");
		
		//charAt - returns a character 
		s="welcome";
		System.out.println("Character present at index 3 is "+s.charAt(3));
		
		//contains method- a particular string is a part of another string
		System.out.println("String s contains \"wel\"? "+s.contains("wel"));
		
		//replace()- replace sigle or a sequence of characters in a string
		
	}

}
