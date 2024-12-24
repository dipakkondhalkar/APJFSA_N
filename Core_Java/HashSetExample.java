import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store elements
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");

        // Display the HashSet before removing elements
        System.out.println("HashSet before clearing: " + hashSet);

        // Remove all elements from the HashSet
        hashSet.clear();

        // Display the HashSet after removing elements
        System.out.println("HashSet after clearing: " + hashSet);
    }
}
/*OUTPUT:
HashSet before clearing: [Apple, Cherry, Date, Banana]
HashSet after clearing: []
 */