import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		String random, temp;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1", 1342);
		Scanner sc1 = new Scanner(s.getInputStream());
		System.out.println("Enter a String: ");
		random = sc.nextLine();
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(random);
		temp = sc1.nextLine();
		System.out.println(temp);
		sc.close();
		s.close();
		sc1.close();
	}
}