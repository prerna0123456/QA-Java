import java.util.Comparator;

public class BookComparator<Book> implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getNoOfCopiesSold()-o2.getNoOfCopiesSold();
	}

}
