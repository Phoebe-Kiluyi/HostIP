import java.util.*;
import java.net.*;
public class HostIP2{
	public static void main(String[]args){
		String hostname;
		Scanner stdin = new Scanner(System.in);
		InetAddress address;
		System.out.print("\n\n Enter a hostname:");
		hostname = stdin.nextLine();
		try{
		address = InetAddress.getByName(hostname);
		System.out.println("\n The IP address for the host;" +hostname+ "is" +address.toString());
 }
 catch(UnknownHostException unHost){
	System.out.println("Url entered has a problem");
	System.exit(0);
 }
	}
}