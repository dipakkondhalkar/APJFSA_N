import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with Integer as the key type and String as the value type
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        // Key is an Integer and Value is a String
        hashMap.put(1, "One");  // Adding the first key-value pair
        hashMap.put(2, "Two");  // Adding the second key-value pair
        hashMap.put(3, "Three"); // Adding the third key-value pair

        // Iterate through the HashMap using a for-each loop over the key set
        // The key set contains all the keys in the HashMap
        for (Integer key : hashMap.keySet()) {
            // Use the key to fetch the corresponding value from the HashMap
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
    }
}
/* OUTPUT:
Key: 1, Value: One
Key: 2, Value: Two
Key: 3, Value: Three
*/