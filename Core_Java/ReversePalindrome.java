package Javaprogram;
import java.util.Scanner; // Import the Scanner class
public class ReversePalindrome {
	    public static void main(String[] args) {    
	        Scanner scanner = new Scanner(System.in);  // Creating a Scanner object
	        // Prompt the user to enter a 3-digit number
	        System.out.print("Enter a 3-digit number: ");
	        int number = scanner.nextInt();

	        // Check if the number is a 3-digit number
	        if (number < 100 || number > 999) {
	            System.out.println("Please enter a valid 3-digit number.");
	        } else {
	            // Reverse the number
	            int reversedNumber = reverseNumber(number);
	            System.out.println("Reversed Number: " + reversedNumber);
	            
	            // Check if the number is a palindrome
	            if (isPalindrome(number)) {
	                System.out.println(number + " is a palindrome.");
	            } else {
	                System.out.println(number + " is not a palindrome.");
	            }
	        }

	        scanner.close();
	    }

	    // Method to reverse a 3-digit number
	    private static int reverseNumber(int num) {
	        int hundreds = num / 100; // Get the hundreds place
	        int tens = (num / 10) % 10; // Get the tens place
	        int units = num % 10; // Get the units place
	        return (units * 100) + (tens * 10) + hundreds; // Construct the reversed number
	    }

	    // Method to check if a number is a palindrome
	    private static boolean isPalindrome(int num) {
	        return num == reverseNumber(num); // A number is a palindrome if it equals its reverse
	    }
}
   // OUTPUT: Enter a 3-digit number: 132
  //Reversed Number: 231
  //132 is not a palindrome.


