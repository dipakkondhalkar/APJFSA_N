package Javaprogram;

public class NumberPattern {
	    public static void main(String[] args) {
	        // Outer loop for the number of rows
	        for (int i = 1; i <= 5; i++) {
	            // Inner loop for printing numbers from 1 to i
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j); // Print the number without a newline
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
}
    //OUTPUT:1
           //12
           //123
           //1234
           //12345
