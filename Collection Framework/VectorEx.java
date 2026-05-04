import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {

        // Vector is synchronized and allows null elements
        // It is a legacy class and is generally not recommended for new code
 

        Vector<String> list = new Vector<>();

        // Add elements to the vector
        list.add("Harshada");
        list.add("Shristi");
        list.add("Pratiksha");

        // Get element at index
        System.out.println(list.get(1)); // Output: Shristi

            // Remove element at index
        list.remove(0); // Removes "Harshada"

        // Check if vector contains an element
        System.out.println(list.contains("Pratiksha")); // Output: true     

        // Iterate over the vector
        System.out.println("Iterating over vector:");
        for (String name : list) {
            System.out.println(name);
        }

        


    }
}
