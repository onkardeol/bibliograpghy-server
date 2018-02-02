
public final class Book {
	private String author = null;
	private String title = null;
	private int year = -1;
	private String publisher = null;
	private int isbn = -1;

	public Book(final String author, final String title, final int year, final String publisher, final int isbn) {
		this.author = author;
		this.title = title;
		this.year = year;
		this.publisher = publisher;
		this.isbn = isbn;
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

	@Override
	public String toString() {
		return (this.author + "\nTitle: " + this.title + "\nYear: " + this.year + "\n Publisher: " + this.publisher
				+ "\n ISBN: " + this.isbn);

	}
}