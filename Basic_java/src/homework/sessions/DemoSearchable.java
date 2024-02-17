package homework.sessions;

import java.util.Scanner;

public class DemoSearchable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to search in the document");
		String str = sc.nextLine();

		Searchable s = new Document();
		s.search(str);

		WebPage w = new WebPage();
		w.search(str);
	}

}
