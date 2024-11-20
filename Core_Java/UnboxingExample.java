public class UnboxingExample {
    public static void main(String[] args) {
        // Example 1: Unboxing with Integer
        Integer integerObject = 42; // Auto-boxing: primitive int to Integer object
        int primitiveInt = integerObject; // Unboxing: Integer object to primitive int

        // Printing the values to show the unboxing process
        System.out.println("Integer Object: " + integerObject); // Wrapper class value
        System.out.println("Primitive int (after unboxing): " + primitiveInt); // Primitive value

        // Example 2: Unboxing with Double
        Double doubleObject = 99.99; // Auto-boxing: primitive double to Double object
        double primitiveDouble = doubleObject; // Unboxing: Double object to primitive double

        // Printing the values to show the unboxing process
        System.out.println("Double Object: " + doubleObject); // Wrapper class value
        System.out.println("Primitive double (after unboxing): " + primitiveDouble); // Primitive value

        // Example 3: Using unboxed values in operations
        Integer a = 10, b = 20;
        int sum = a + b; // Unboxing both Integer objects into primitive ints for addition
        System.out.println("Sum (after unboxing): " + sum); // Result of the operation
    }
}
/*Output:-
Integer Object: 42
Primitive int (after unboxing): 42
Double Object: 99.99
Primitive double (after unboxing): 99.99
Sum (after unboxing): 30
*/