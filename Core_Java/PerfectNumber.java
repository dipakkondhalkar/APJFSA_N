import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variable to store the sum of divisors
        int sum = 0;

        // Loop to find divisors of the number (excluding the number itself)
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Check if the sum of divisors equals the original number
        if (sum == num && num != 0) {
            System.out.println(num + " is a Perfect Number.");
        } else {
            System.out.println(num + " is not a Perfect Number.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
/*Output:-
Enter a number: 6
6 is a Perfect Number.
 */