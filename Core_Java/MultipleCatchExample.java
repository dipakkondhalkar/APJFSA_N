public class MultipleCatchExample {

    public static void main(String[] args) {
        // Initialize two numbers for division
        int numerator = 10;
        int denominator = 0; // Setting denominator to 0 to demonstrate ArithmeticException
        int[] numbers = {1, 2, 3}; // Array of integers

        try {
            // Attempt to perform division
            int result = numerator / denominator; 
            System.out.println("Result: " + result); // This line won't execute if an exception occurs
            
            // Attempt to access an element outside the array bounds
            int number = numbers[5]; // Accessing index 5 will throw ArrayIndexOutOfBoundsException
            System.out.println("Number at index 5: " + number);
        } 
        // Catch block for ArithmeticException (division by zero)
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println("Exception Message: " + e.getMessage());
        } 
        // Catch block for ArrayIndexOutOfBoundsException (invalid array access)
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
            System.out.println("Exception Message: " + e.getMessage());
        } 
        // Generic catch block for any other unexpected exceptions
        catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            System.out.println("Exception Message: " + e.getMessage());
        } 
        finally {
            // Finally block will execute regardless of whether an exception occurs
            System.out.println("Execution of try-catch blocks is complete.");
        }
    }
}
/*OUTPUT:-
Error: Division by zero is not allowed.
Exception Message: / by zero
Execution of try-catch blocks is complete. */