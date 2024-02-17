package homework.sessions;

import java.util.Scanner;

public class WebPage implements Searchable {

	@Override
	public void search(String keyword) {
		String s = "Write a Java program to create an interface Searchable with a method search(String keyword) "
				+ "that searches for a given keyword in a text document. Create two classes Document and WebPage "
				+ "that implement the Searchable interface and provide their own implementations of the search() "
				+ "method.";

		if ((s.toUpperCase()).contains(keyword.toUpperCase())) {
			System.out.println("\"" + keyword + "\" is present in the given line/paragraph");
		} else {
			System.out.println("\"" + keyword + "\" is not present in the given line/paragraph");
		}
	}

}
