package classes.ten;

import java.util.HashSet;
import java.util.Set;

public class DemoBook1 {

	public static void main(String[] args) {
		Book b1 = new Book("B1", "1234");
		Book b2 = new Book("B1", "1234");
		Book b3 = new Book("B3", "2345");
		Book b4 = new Book("B4", "4567");

		Set<Book> s = new HashSet<>();

		s.add(b1);
		s.add(b2);
		s.add(b3);
		s.add(b4);

		System.out.println(s);

	}

}
