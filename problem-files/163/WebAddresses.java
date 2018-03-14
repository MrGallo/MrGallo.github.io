class Address {
    String street;
    String city;
    String state;
    int zip;
}

public class WebAddresses {
    public static void main(String[] args) throws Exception {

        Address disneyLand = new Address();
        disneyLand.street = "1313 Disneyland Dr";
        disneyLand.city   = "Anaheim";
        disneyLand.state  = "California";
        disneyLand.zip    = 92802;

        System.out.println(disneyLand.street + ", " + disneyLand.city + ", " + disneyLand.state + "  " + disneyLand.zip);
    }
}

