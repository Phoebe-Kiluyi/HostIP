import java.util.*;
import java.net.*;
public class HostIP{
	public static void main(String[]args)throws UnknownHostException{
		String hostname;
		Scanner stdin = new Scanner(System.in);
		InetAddress address;
		System.out.print("\n\n Enter a hostname:");
		hostname = stdin.nextLine();
		address = InetAddress.getByName(hostname);
		System.out.println("\n The IP address for the host;"+hostname+"is"+address.toString());

	}
}