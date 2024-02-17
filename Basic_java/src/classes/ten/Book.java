package classes.ten;

import java.util.Objects;

public class Book {

	String numISBN;
	String bookName;

	public Book() {
		super();
	}

	public Book(String numISBN, String bookName) {
		super();
		this.numISBN = numISBN;
		this.bookName = bookName;
	}

	public String getNumISBN() {
		return numISBN;
	}

	public void setNumISBN(String numISBN) {
		this.numISBN = numISBN;
	}

	public String getBookName() {
		return bookName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bookName, numISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookName, other.bookName) && Objects.equals(numISBN, other.numISBN);
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [numISBN=" + numISBN + ", bookName=" + bookName + "]";
	}

}
