
import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Store the original number to compare later
        int originalNum = num;

        // Variable to store the reversed number
        int reversedNum = 0;

        // Loop to reverse the digits of the number
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Add digit to reversed number
            num /= 10; // Remove the last digit from num
        }

        // Check if the original number is equal to the reversed number
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome number.");
        } else {
            System.out.println(originalNum + " is not a Palindrome number.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
/*OUTPUT:-
Enter a number: 131
131 is a Palindrome number.
 */