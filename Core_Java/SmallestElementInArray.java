// Java program to find the smallest element in an array
public class SmallestElementInArray {
    public static void main(String[] args) {
        // Define an array
        int[] numbers = {45, 12, 78, 34, 89, 23};

        // Assume the first element is the smallest
        int smallest = numbers[0];

        // Loop through the array to find the smallest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update smallest if a smaller element is found
            }
        }

        // Print the smallest element
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
/*The smallest element in the array is: 12 */