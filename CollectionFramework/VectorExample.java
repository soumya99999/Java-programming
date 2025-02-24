import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Red");
        vector.add("Blue");
        vector.add("Green");
        vector.add("Yellow");

        System.out.println("Vector: " + vector);

        // Get element at index
        System.out.println("Element at index 1: " + vector.elementAt(1));

        // Remove element
        vector.remove("Green");
        System.out.println("After removal: " + vector);

        // Check size and trim capacity
        System.out.println("Size before trim: " + vector.size());
        vector.trimToSize();
        System.out.println("Size after trim: " + vector.capacity());

        // Cloning the Vector
        Vector<String> clonedVector = (Vector<String>) vector.clone();
        System.out.println("Cloned Vector: " + clonedVector);
    }
}
