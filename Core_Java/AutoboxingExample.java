import java.util.ArrayList;

public class AutoboxingExample {
    public static void main(String[] args) {
        // Step 1: Declare a primitive data type variable
        int num = 10; // Primitive integer
        
        // Step 2: Autoboxing - Converting primitive int to Integer object
        Integer numObj = num; // Java automatically converts 'num' to Integer
        
        // Step 3: Adding primitive values to a collection (like ArrayList)
        ArrayList<Integer> numbersList = new ArrayList<>();
        
        // Autoboxing occurs here when adding primitive values
        numbersList.add(5);  // 5 is converted to Integer
        numbersList.add(15); // 15 is converted to Integer
        numbersList.add(num); // 'num' is converted to Integer
        
        // Step 4: Printing the elements of the ArrayList
        System.out.println("Elements in the ArrayList: " + numbersList);

        // Explanation of usage in expressions
        Integer result = numObj + 20; // Autoboxing in action during addition
        
        System.out.println("Result of addition with autoboxed Integer: " + result);
        
        // Step 5: Autoboxing helps simplify working with collections
        for (Integer number : numbersList) {
            // No explicit conversion needed here, Java handles it automatically
            System.out.println("Value: " + number);
        }
    }
}
/*Output:-
Elements in the ArrayList: [5, 15, 10]
Result of addition with autoboxed Integer: 30
Value: 5
Value: 15
Value: 10 */