package homework.sessions;

import java.util.Scanner;

public class Document implements Searchable {

	@Override
	public void search(String keyword) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line or a paragraph");
		String s = sc.nextLine();

		if ((s.toUpperCase()).contains(keyword.toUpperCase())) {
			System.out.println("\"" + keyword + "\" is present in the given line/paragraph");
		} else {
			System.out.println("\"" + keyword + "\" is not present in the given line/paragraph");
		}

	}

}
