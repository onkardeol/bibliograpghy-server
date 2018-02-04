import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket s = new Socket("127.0.0.1", 5555);
		
		
		
		PrintWriter p = new PrintWriter(s.getOutputStream(), true);
		p.println("Test");
		
		Scanner sOut = new Scanner(s.getInputStream());
		System.out.println("From server: " + sOut.nextLine());
		
		s.close();
		sOut.close();
		p.close();
	}
}