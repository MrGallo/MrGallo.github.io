import java.net.URL;
import java.util.Scanner;

class Address {
    String street;
    String city;
    String state;
    int zip;
}

public class WebAddresses {
    public static void main(String[] args) throws Exception {
        URL addressFile = new URL("https://mrgallo.github.io/problem-files/163/fake-addresses.txt");
        Scanner scan = new Scanner(addressFile.openStream());

        Address address1 = new Address();
        address1.street = scan.nextLine();
        address1.city   = scan.nextLine();
        address1.state  = scan.next();
        address1.zip    = scan.nextInt();
        scan.skip("\n");

        scan.close();
        
        System.out.println(address1.street + ", " + address1.city + ", " + address1.state + "  " + address1.zip);
    }
}

