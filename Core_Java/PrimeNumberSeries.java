import java.util.Scanner;

public class PrimeNumberSeries {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the limit up to which they want the prime numbers
        System.out.print("Enter the limit to print prime numbers: ");
        int limit = scanner.nextInt();

        // Print the prime numbers up to the given limit
        System.out.println("Prime numbers up to " + limit + ":");

        // Loop through all numbers from 2 to the limit (since 1 is not a prime number)
        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;

            // Check if the number is divisible by any number between 2 and sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;  // If divisible, it's not prime
                    break;
                }
            }

            // If isPrime is still true, then the number is prime
            if (isPrime) {
                System.out.print(num + " "); // Print the prime number
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
/*OUTPUT:-
Enter the limit to print prime numbers: 30
Prime numbers up to 30:
2 3 5 7 11 13 17 19 23 29  */