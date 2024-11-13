public class Address {
    
    private String street;  // Street address
    private String city;    // City
    private String state;   // State
    private String zipCode; // Zip code

    // Default constructor
    // Initializes the attributes with default values
    public Address() {
        this.street = "";   // Default empty string for street
        this.city = "";     // Default empty string for city
        this.state = "";    // Default empty string for state
        this.zipCode = "";  // Default empty string for zip code
    }

    // Parameterized constructor (with arguments)
    // Initializes the attributes with given values
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;  // Set the street using the constructor argument
        this.city = city;      // Set the city using the constructor argument
        this.state = state;    // Set the state using the constructor argument
        this.zipCode = zipCode; // Set the zip code using the constructor argument
    }

    // Getter method for street (to access the value of street)
    public String getStreet() {
        return street;  // Return the value of the street
    }

    // Setter method for street (to modify the value of street)
    public void setStreet(String street) {
        this.street = street;  // Assign the new value to street
    }

    // Getter method for city (to access the value of city)
    public String getCity() {
        return city;  // Return the value of the city
    }

    // Setter method for city (to modify the value of city)
    public void setCity(String city) {
        this.city = city;  // Assign the new value to city
    }

    // Getter method for state (to access the value of state)
    public String getState() {
        return state;  // Return the value of the state
    }

    // Setter method for state (to modify the value of state)
    public void setState(String state) {
        this.state = state;  // Assign the new value to state
    }

    // Getter method for zip code (to access the value of zip code)
    public String getZipCode() {
        return zipCode;  // Return the value of the zip code
    }

    // Setter method for zip code (to modify the value of zip code)
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;  // Assign the new value to zip code
    }

    // Method to print the full address in a readable format
    public void displayAddress() {
        System.out.println("Address: " + street + ", " + city + ", " + state + " - " + zipCode);
    }

    // Main method to test the Address class
    public static void main(String[] args) {
        // Create an Address object using the parameterized constructor
        Address address1 = new Address("123 Main St", "Springfield", "IL", "62701");

        // Display the address using the displayAddress method
        address1.displayAddress(); // Output: Address: 123 Main St, Springfield, IL - 62701

        // Create an Address object using the default constructor
        Address address2 = new Address();

        // Set values using setter methods
        address2.setStreet("456546 Elm St");
        address2.setCity("Chicago");
        address2.setState("IL");
        address2.setZipCode("60603354451");

        // Display the address using the displayAddress method
        address2.displayAddress(); // Output: Address: 456 Elm St, Chicago, IL - 60601
    }
}
/*
OUTPUT:
Address: 123 Main St, Springfield, IL - 62701
Address: 456546 Elm St, Chicago, IL - 60603354451 */
