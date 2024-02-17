package compare.classes;

public class Book {

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", ISBN=" + ISBN + ", noOfCopiesSold=" + noOfCopiesSold + ", price="
				+ price + "]";
	}
	private String bookName;
	private String ISBN;
	private Integer noOfCopiesSold;
	private Double price;
	public Book(String bookName, String iSBN, Integer noOfCopiesSold, Double price) {
		super();
		this.bookName = bookName;
		this.ISBN = iSBN;
		this.noOfCopiesSold = noOfCopiesSold;
		this.price = price;
	}
	public Book() {
		super();
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Integer getNoOfCopiesSold() {
		return noOfCopiesSold;
	}
	public void setNoOfCopiesSold(Integer noOfCopiesSold) {
		this.noOfCopiesSold = noOfCopiesSold;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}

