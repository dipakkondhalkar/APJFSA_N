package Javaprogram;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display the Welcome message
        System.out.println("Welcome to the check Armstrong Number");

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNumber = num;
        int remainder;
        int result = 0;
        int numberOfDigits = String.valueOf(num).length(); // Count the number of digits

        // Check if the number is an Armstrong number
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, numberOfDigits); // Raise the digit to the power of the number of digits
            originalNumber /= 10;
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
/* Output
Welcome to the check Armstrong Number
Enter a number: 153
153 is an Armstrong number.*/


