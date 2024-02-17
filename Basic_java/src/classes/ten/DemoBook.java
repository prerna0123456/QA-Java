package classes.ten;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class DemoBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many books you would like to create");
		int numOfBooks = sc.nextInt();
		sc.nextLine();
		String nm = "";
		String isbn = "";

		Collection<Book> books = new ArrayList<Book>();

		for (int i = 0; i < numOfBooks; i++) {
			System.out.println("Enter a book name: ");

			nm = sc.nextLine();
			System.out.println("Enter book's ISBN: ");

			isbn = sc.nextLine();

			Book b = new Book(isbn, nm);
			books.add(b);
		}
		System.out.println(books);
		Book b2=new Book("11","b1");
		System.out.println(books.containsAll(books));
	}

}
