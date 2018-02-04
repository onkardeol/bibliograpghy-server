
public final class Book {
	private String author = "";
	private String title = "";
	private int year = -1;
	private String publisher = "";
	private int isbn = -1;

	public Book(final String author, final String title, final int year, final String publisher, final int isbn) {
		this.isbn = isbn;
		this.author = author;
		this.title = title;
		this.year = year;
		this.publisher = publisher;
	}

	public Book() {
	}

	public void setAuthor(final String author) {
		this.author = author;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public void setYear(final int year) {
		this.year = year;
	}

	public void setPublisher(final String publisher) {
		this.publisher = publisher;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getTitle() {
		return this.title;
	}

	public int getYear() {
		return this.year;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public int getIsbn() {
		return this.isbn;
	}

	public boolean compareBook(Book book) {
		if (this.author == book.getAuthor() && this.title == book.getTitle() && this.year == book.getYear()
				&& this.publisher == book.getPublisher() && this.isbn == book.getIsbn())
			return true;

		return false;
	}

	@Override
	public String toString() {
		return ("Author: " + this.author + " Title: " + this.title + " Year: " + this.year + " Publisher: "
				+ this.publisher + " ISBN: " + this.isbn);

	}
}