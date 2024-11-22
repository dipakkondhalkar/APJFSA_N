public class ArrayIndexOutOfBoundsExample {

    public static void main(String[] args) {
        // Initialize an array with 3 elements
        int[] numbers = {10, 20, 30};

        // Variable to hold the index to be accessed
        int indexToAccess = 5; // Index 5 is out of bounds for this array

        try {
            // Attempt to access the array at the specified index
            int number = numbers[indexToAccess]; 
            // If no exception, print the number
            System.out.println("Number at index " + indexToAccess + ": " + number);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            // Catch block to handle the exception if index is out of bounds
            System.out.println("Error: Array index is out of bounds.");
            // Print the exception message (optional)
            System.out.println("Exception Message: " + e.getMessage());
        } 
        finally {
            // Finally block executes regardless of exception occurrence
            System.out.println("Array access attempt is complete.");
        }
    }
}
/*OUTPUT:-
Error: Array index is out of bounds.
Exception Message: Index 5 out of bounds for length 3
Array access attempt is complete.
 */