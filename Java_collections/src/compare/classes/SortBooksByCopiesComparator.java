package compare.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortBooksByCopiesComparator {

	public static void main(String[] args) {
	    
	    Book b1 = new Book("Ferrari ki Savaari", "2345", 143500, 25.4);
	    
	    Book b2 = new Book("Origin", "5445", 4500, 45.4);
	    
	    Book b3 = new Book("Da Vinci Code", "3421", 24500, 55.4);
	    
	    Book b4 = new Book("DS Using Java", "9870", 189500, 85.4);
	    
	    List<Book> books = new ArrayList<>();
	    
	    books.add(b4);
	    books.add(b3);
	    books.add(b2);
	    books.add(b1);
	    
	    
	    displayBooks(books);
	    
	    Collections.sort(books, new BookComparator());
	    System.out.println("After sorting");
	    displayBooks(books);
	    
	    //sort on names of books
	    
	    Collections.sort(books, new BookComparatorName());
	    
	    System.out.println("After sorting");
	    displayBooks(books);
	    
//	    
//	    System.out.println(books);
//	    
	    
	}
	
	public static void displayBooks(List<Book> b) {
		for(Book b1: b) {
			System.out.println(b1);
		}
	}
}
