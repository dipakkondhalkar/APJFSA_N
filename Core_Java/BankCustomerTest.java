
class BankCustomer {
    // Fields to store account number, account type, and amount
    private String acno;  // Account number
    private String atype;  // Account type (e.g., Savings, Current)
    private double amt;    // Amount in the account
    
    // Constructor with all parameters
    public BankCustomer(String acno, String atype, double amt) {
        this.acno = acno;   // Initialize account number
        this.atype = atype; // Initialize account type
        this.amt = amt;     // Initialize amount
    }

    // Constructor with account number and account type (amount defaults to 0)
    public BankCustomer(String acno, String atype) {
        this(acno, atype, 0.0); // Call the main constructor with default amount
    }

    // Constructor with only account number (type defaults to 'Unknown' and amount to 0)
    public BankCustomer(String acno) {
        this(acno, "Unknown", 0.0); // Call the main constructor with default type and amount
    }

    // Method to display customer details
    public void displayDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }
}

// Main class to test the BankCustomer class
public class BankCustomerTest {
    public static void main(String[] args) {
        // Create a BankCustomer object using the constructor with all parameters
        BankCustomer customer1 = new BankCustomer("123456", "Savings", 1500.50);
        customer1.displayDetails(); // Display details of customer1

        System.out.println(); // Print a blank line for better readability

        // Create a BankCustomer object using the constructor with account number and account type
        BankCustomer customer2 = new BankCustomer("234567", "Current");
        customer2.displayDetails(); // Display details of customer2

        System.out.println(); // Print a blank line for better readability

        // Create a BankCustomer object using the constructor with only account number
        BankCustomer customer3 = new BankCustomer("345678");
        customer3.displayDetails(); // Display details of customer3
    }
}
/* 
Account Number: 123456
Account Type: Savings
Amount: 1500.5        

Account Number: 234567
Account Type: Current
Amount: 0.0

Account Number: 345678
Account Type: Unknown
Amount: 0.0   */