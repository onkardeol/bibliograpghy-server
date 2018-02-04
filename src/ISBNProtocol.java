import java.util.ArrayList;

public class ISBNProtocol {
	ArrayList<Book> dataStructure = WebServer.returnData();
	ArrayList<Book> returnList;
	String change = null;

	ISBNProtocol() {

	}

	public String ProcessInput(String input) {
		String output = "";
		String[] split = input.split(",");

		if (change.equals("SUBMIT")) {
			Book newBook = new Book(split[0], split[1], Integer.parseInt(split[2]), split[3],
					Integer.parseInt(split[4]));
			WebServer.insertBook(newBook);
		} else if (change.equals("UPDATE")) {

		} else if (change.equals("GET")) {

		} else if (change.equals("REMOVE")) {

		}
		return output;
	}

	public void findBookAuthor(String author) {
		// ArrayList<Book> returnList = new ArrayList<Book>();
		for (int i = 0; i < dataStructure.size(); i++) {
			if (dataStructure.get(i).getAuthor() == author) {
				returnList.add(dataStructure.get(i));
			}
		}
		// return returnList;
	}

	public void findBookTitle(String title) {
		// ArrayList<Book> returnList = new ArrayList<Book>();
		for (int i = 0; i < dataStructure.size(); i++) {
			if (dataStructure.get(i).getTitle() == title) {
				returnList.add(dataStructure.get(i));
			}
		}
		// return returnList;
	}

	public void findBookPublisher(String publisher) {
		// ArrayList<Book> returnList = new ArrayList<Book>();
		for (int i = 0; i < dataStructure.size(); i++) {
			if (dataStructure.get(i).getPublisher() == publisher) {
				returnList.add(dataStructure.get(i));
			}
		}
		// return returnList;
	}

	public void findBookYear(int year) {
		// ArrayList<Book> returnList = new ArrayList<Book>();
		for (int i = 0; i < dataStructure.size(); i++) {
			if (dataStructure.get(i).getYear() == year) {
				returnList.add(dataStructure.get(i));
			}
		}
		// return returnList;
	}

	public Book findBookISBN(int ISBN) {
		Book returnBook = null;
		for (int i = 0; i < dataStructure.size(); i++) {
			if (dataStructure.get(i).getIsbn() == ISBN) {
				returnBook = dataStructure.get(i);
				break;
			}
		}
		return returnBook;
	}

}