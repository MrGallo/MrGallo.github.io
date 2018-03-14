import java.net.URL;
import java.util.Scanner;

class Address {
	String street;
	String city;
	String state;
	int zip;

	public String toString() {
		return (this.street + ", " + this.city + "  " + this.zip);
	}
}

public class AddressToString {
	public static void main(String[] args) throws Exception {
		URL addressFile = new URL("https://mrgallo.github.io/problem-files/163/fake-addresses.txt");
		Scanner scan = new Scanner(addressFile.openStream());
		
		Address[] addressBook = new Address[5];
		for (int i = 0; i < 5; i++) {
			addressBook[i] = new Address();
			addressBook[i].street = scan.nextLine();
			addressBook[i].city   = scan.nextLine();
			addressBook[i].state  = scan.next();
			addressBook[i].zip    = scan.nextInt();
			scan.skip("\n");
		}
		scan.close();
		
		for (int i = 0; i < 5; i++) {
			System.out.println((i+1) + ". " + addressBook[i]);
		}
	}
}

