import java.io.*;
import java.net.*;
import java.util.*;

public class WebServer {
	//private static ArrayList<Book> dataStructure = new ArrayList<Book>();
	
    public static void main(String argv[]) throws Exception {
		// Get the port number from the command line.
		int port = 5555;
		
		try { port = Integer.parseInt(argv[0]); }
		catch (Exception e) {
			System.out.println("Invalid port: defaulting to 5555");
		}
		
		ServerSocket socket = new ServerSocket(port);
		
		System.out.println(String.format("Starting server on %s:%s", 
				socket.getInetAddress().getHostAddress(), socket.getLocalPort()));
		
		// Process HTTP service requests in an infinite loop.
		while (true) {
		    // Listen for a TCP connection request.
		    Socket connection = socket.accept();
		    
		    // Construct an object to process the HTTP request message.
		    ISBNProtocol protocol = new ISBNProtocol(connection);
		    
		    // Create a new thread to process the request.
		    Thread thread = new Thread(protocol);
		    
		    // Start the thread.
		    thread.start();
		}
    }
}

//	public static void main(String[] args) throws IOException {
//		String random, temp;
//		ServerSocket serverSocket = new ServerSocket(1342);
//		Socket ss = serverSocket.accept();
//		Scanner sc = new Scanner(ss.getInputStream());
//		random = sc.nextLine();
//		temp = random + " server";
//		PrintStream p = new PrintStream(ss.getOutputStream());
//		Book x = (new Book("Rishhi", "Title", 1997, "rndom", 1234));
//		p.println(x.toString());
//		sc.close();
//		serverSocket.close();
//	}
//
//	public static void insertBook(Book book) {
//		int i;
//		for (i = 0; i < dataStructure.size(); i++) {
//			if (dataStructure.get(i).compareBook(book) == true) {
//				// Input msg to output to console that adding book is duplicate.
//				break;
//			} else {
//				dataStructure.add(book);
//			}
//		}
//	}
//
//	public static ArrayList<Book> returnData() {
//		return WebServer.dataStructure;
//	}