import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ISBNProtocol implements Runnable {
	static ArrayList<Book> dataStructure = WebServer.returnData();
	ArrayList<Book> returnList;
	String change = "";

	final static String CRLF = "\r\n";
	ArrayList<Book> book = new ArrayList<Book>();
	private Socket socket;

	// Constructor
	public ISBNProtocol(Socket socket) throws Exception {
		this.socket = socket;
	}

	// Implement the run() method of the Runnable interface.
	@Override
	public void run() {
		try {
			processRequest();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void processRequest() throws Exception {
		DataOutputStream os = new DataOutputStream(socket.getOutputStream());
		Scanner is = new Scanner(socket.getInputStream());
		try {
			String reqType = is.nextLine().trim();
			String[] split = reqType.split(",");
			int i;

			if (split[0].equals("SUBMIT")) {
				Book newBook = new Book(split[1], split[2], split[3], (split[4]), split[5]);
				WebServer.insertBook(newBook);
				System.out.println(WebServer.returnData().get(0).toString());
			} else if (split[0].equals("UPDATE")) {
				int bookPosition;
				for (i = 0; i < dataStructure.size(); i++) {
					if (dataStructure.get(i).getIsbn() == (split[0])) {
						bookPosition = i;
					}
				}
				for (i = 1; i < 7; i++) {
					if (split[i].equals("null") == null) {
						continue;
					}
				}
			} else if (split[0].equals("GET")) {
				String line = split[1];
				os.writeBytes("ISBN " + dataStructure.get(0).getIsbn() + CRLF);
				os.writeBytes("TITLE " + dataStructure.get(0).getTitle() + CRLF);
				os.writeBytes("AUTHOR " + dataStructure.get(0).getAuthor() + CRLF);
				os.writeBytes("PUBLISHER " + dataStructure.get(0).getPublisher() + CRLF);
				os.writeBytes("YEAR " + dataStructure.get(0).getYear() + CRLF);

				// if (line.equals("ALL")) {
				// writeSuccess(os, dataStructure);
				// }
			} else if (split[0].equals("REMOVE")) {
				ArrayList<Integer> infoToUse = new ArrayList<Integer>();
				for( i = 1; i < 7; i++) {
					if(!split[i].equals("null")) {
						infoToUse.add(i);
					}
				}
				ArrayList<Book> returnList=dataStructure;
				for(i = 0; i < dataStructure.size(); i++) {
					
				}
			}
		} catch (Exception e) {

		}

		String line = is.nextLine();

		System.out.println("From client: " + line);

		os.writeBytes(line);
	}
	public void checkAttributes() {
		
	}

	// private static void writeSuccess(DataOutputStream os, List<Book> books)
	// throws Exception {
	// os.writeBytes("SUCCESS" + CRLF);
	// if (books.isEmpty())
	// os.writeBytes("No entries to display");
	// else {
	// for (int i = 0; i < books.size(); i++) {
	// writeBookInformation(os, books.get(i));
	// if (i != books.size() - 1)
	// os.writeBytes("- - - -" + CRLF);
	// }
	// }
	// }
	//
	// private static void writeBookInformation(DataOutputStream os, Book book)
	// throws Exception {
	// os.writeBytes("ISBN " + book.getIsbn() + CRLF);
	// os.writeBytes("TITLE " + book.getTitle() + CRLF);
	// os.writeBytes("AUTHOR " + book.getAuthor() + CRLF);
	// os.writeBytes("PUBLISHER " + book.getPublisher() + CRLF);
	// os.writeBytes("YEAR " + book.getYear() + CRLF);
	// }
	//
	// private static List<Book> getBooksWithMatchingAttribute(String attribute,
	// String content) {
	// List<Book> queryBooks = new ArrayList<Book>();
	// for (int i = 0; i < dataStructure.size(); i++) {
	// Book book = dataStructure.get(i);
	// if ((attribute.equals("ISBN") && book.getIsbn().equals(content))
	// || (attribute.equals("TITLE") && book.getTitle().equals(content))
	// || (attribute.equals("AUTHOR") && book.getAuthor().equals(content))
	// || (attribute.equals("PUBLISHER") && book.getPublisher().equals(content))
	// || (attribute.equals("YEAR") && book.getYear().equals(content)))
	// queryBooks.add(book);
	// }
	// return queryBooks;
	// }

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

	public void findBookYear(String year) {
		// ArrayList<Book> returnList = new ArrayList<Book>();
		for (int i = 0; i < dataStructure.size(); i++) {
			if (dataStructure.get(i).getYear().equals(year)) {
				returnList.add(dataStructure.get(i));
			}
		}
		// return returnList;
	}

	public Book findBookISBN(String ISBN) {
		Book returnBook = null;
		for (int i = 0; i < dataStructure.size(); i++) {
			if (dataStructure.get(i).getIsbn().equals(ISBN)) {
				returnBook = dataStructure.get(i);
				break;
			}
		}
		return returnBook;
	}

}