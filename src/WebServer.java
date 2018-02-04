import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class WebServer {
	private static ArrayList<Book> dataStructure = new ArrayList<Book>();

	public static void main(String[] args) throws IOException {
		String random, temp;
		ServerSocket serverSocket = new ServerSocket(1342);
		Socket ss = serverSocket.accept();
		Scanner sc = new Scanner(ss.getInputStream());
		random = sc.nextLine();
		temp = random + " server";
		PrintStream p = new PrintStream(ss.getOutputStream());
		Book x = (new Book("Rishhi", "Title", 1997, "rndom", 1234));
		p.println(x.toString());
		sc.close();
		serverSocket.close();
	}

	public static void insertBook(Book book) {
		int i;
		for(i = 0; i < dataStructure.size(); i++){
			if(dataStructure[i].compareBook(book) == true){
				// Input msg to output to console that adding book is duplicate.
				break;
			} else {
				dataStructure.add(book);
			}
		}
	}

	public static ArrayList<Book> returnData() {
		return WebServer.dataStructure;
	}
}
