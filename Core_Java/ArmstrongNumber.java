public class ArmstrongNumber {

    public static void main(String[] args) {
        int lower = 1, upper = 999; // Set the range (1 to 999)

        // Loop through all numbers in the range
        for (int num = lower; num <= upper; num++) {
            int sum = 0, temp, remainder, n = 0;

            // Store the number in a temporary variable (temp)
            temp = num;

            // Find the number of digits in the given number
            while (temp != 0) {
                temp /= 10;
                ++n;
            }

            // Reset temp to the original number
            temp = num;

            // Calculate the sum of the power of the digits
            while (temp != 0) {
                remainder = temp % 10; // Get the last digit
                sum += Math.pow(remainder, n); // Add the power of the digit
                temp /= 10; // Remove the last digit
            }

            // If the sum is equal to the original number, it's an Armstrong number
            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            }
        }
    }
}
/*OUTPUT:-
1 is an Armstrong number.
2 is an Armstrong number.  
3 is an Armstrong number.
4 is an Armstrong number.
5 is an Armstrong number.
6 is an Armstrong number.
7 is an Armstrong number.
8 is an Armstrong number.
9 is an Armstrong number.
153 is an Armstrong number.
370 is an Armstrong number.
371 is an Armstrong number.
407 is an Armstrong number. */