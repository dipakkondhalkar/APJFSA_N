public class ArithmeticExceptionExample {

    public static void main(String[] args) {
        // Initialize two numbers for division
        int numerator = 10;
        int denominator = 0; // Setting denominator to 0 to demonstrate exception

        try {
            // Attempt to perform division
            int result = numerator / denominator;
            // This line will not execute if an ArithmeticException occurs
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block to handle the exception
            // This block will execute if division by zero is attempted
            System.out.println("Error: Division by zero is not allowed.");
            // Print the exception message (optional)
            System.out.println("Exception Message: " + e.getMessage());
        } finally {
            // Optional finally block, executes whether an exception occurs or not
            System.out.println("Division attempt complete.");
        }
    }
}
/*OUTPUT:-
Error: Division by zero is not allowed.
Exception Message: / by zero
Division attempt complete.
 */
