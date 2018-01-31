

public final class Bibliography{
	private String author = null;
	private String title = null;
	private int year = -1;
	private String publisher = null;
	private int isbn = -1;

	public Bibliography(final String author, final String title, final int year, final String publisher, final int isbn){
		this.author = author;
		this.title = title;
		this.year = year;
		this.publisher = publisher;
		this.isbn = isbn;
	}

	public void setAuthor(final String author){
		this.author = author;
	}

	public void setTitle(final String title){
		this.title = title;
	}

	public void setYear(final int year){
		this.year = year;
	}

	public void setPublisher(final String publisher){
		this.publisher = publisher;
	}

	public String getAuthor(){
		return this.author;
	}

	public String getTitle(){
		return this.title;
	}

	public int getYear(){
		return this.year;
	}

	public String getPublisher(){
		return this.publisher;
	}

	public int getIsbn(){
		return this.isbn;
	}
}