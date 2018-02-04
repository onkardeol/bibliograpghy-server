import java.util.*;
import java.net.*;
import java.io.*;

public class ISBNProtocol implements Runnable {
//	ArrayList<Book> dataStructure = WebServer.returnData();
//	ArrayList<Book> returnList;
//	String change = null;
//	int year = gui_client.getYear();
	
	final static String CRLF = "\r\n";
	ArrayList<Book> book = new ArrayList<Book>();
    private Socket socket;
    
    // Constructor
    public ISBNProtocol(Socket socket) throws Exception {
    		this.socket = socket;
    }
    
    // Implement the run() method of the Runnable interface.
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
    		
    		String line = is.nextLine();
    		
    		System.out.println("From client: " + line);
    		
    		os.writeBytes(line);
    }

//	public String ProcessInput(String input) {
//		String output = "";
//		String[] split = input.split(",");
//		int i;
//
//		if (change.equals("SUBMIT")) {
//			Book newBook = new Book(gui_client.getAuthor(), split[1], Integer.parseInt(split[2]), split[3],
//					Integer.parseInt(split[4]));
//			WebServer.insertBook(newBook);
//		} else if (change.equals("UPDATE")) {
//			int bookPosition;
//			for(i = 0; i < dataStructure.size(); i++) {
//				if(dataStructure.get(i).getIsbn() == Integer.parseInt(split[0])){
//					bookPosition = i;
//				}
//			}
//			for(i = 1; i < 6; i++) {
//				if(split[i] == null || Integer.parseInt(split[i]) == -1) {
//					continue;
//				}
//			}
//		} else if (change.equals("GET")) {
//
//		} else if (change.equals("REMOVE")) {
//
//		}
//		return output;
//	}
//
//	public void findBookAuthor(String author) {
//		// ArrayList<Book> returnList = new ArrayList<Book>();
//		for (int i = 0; i < dataStructure.size(); i++) {
//			if (dataStructure.get(i).getAuthor() == author) {
//				returnList.add(dataStructure.get(i));
//			}
//		}
//		// return returnList;
//	}
//
//	public void findBookTitle(String title) {
//		// ArrayList<Book> returnList = new ArrayList<Book>();
//		for (int i = 0; i < dataStructure.size(); i++) {
//			if (dataStructure.get(i).getTitle() == title) {
//				returnList.add(dataStructure.get(i));
//			}
//		}
//		// return returnList;
//	}
//
//	public void findBookPublisher(String publisher) {
//		// ArrayList<Book> returnList = new ArrayList<Book>();
//		for (int i = 0; i < dataStructure.size(); i++) {
//			if (dataStructure.get(i).getPublisher() == publisher) {
//				returnList.add(dataStructure.get(i));
//			}
//		}
//		// return returnList;
//	}
//
//	public void findBookYear(int year) {
//		// ArrayList<Book> returnList = new ArrayList<Book>();
//		for (int i = 0; i < dataStructure.size(); i++) {
//			if (dataStructure.get(i).getYear() == year) {
//				returnList.add(dataStructure.get(i));
//			}
//		}
//		// return returnList;
//	}
//
//	public Book findBookISBN(int ISBN) {
//		Book returnBook = null;
//		for (int i = 0; i < dataStructure.size(); i++) {
//			if (dataStructure.get(i).getIsbn() == ISBN) {
//				returnBook = dataStructure.get(i);
//				break;
//			}
//		}
//		return returnBook;
//	}

}