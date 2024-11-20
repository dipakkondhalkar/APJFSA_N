// Java program to find the largest element in an array
public class LargestElementInArray {
    public static void main(String[] args) {
        // Define an array
        int[] numbers = {45, 12, 78, 34, 89, 23};

        // Assume the first element is the largest
        int largest = numbers[0];

        // Loop through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // Update largest if a larger element is found
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}
/*The largest element in the array is: 89 */
