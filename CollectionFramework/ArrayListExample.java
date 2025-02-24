import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements as an object
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        // Adding at particular index will be not like it will replace the data it will add the data and
        // increase the size of te arraylist and move the elements accordingly
        list.add(1, "Mango"); // Adding at specific index

        System.out.println("ArrayList: " + list);

        // Get element at index
        System.out.println("Element at index 2: " + list.get(2));

        // Remove element
        list.remove("Banana");
        System.out.println("After removal: " + list);

        // Update an element
        list.set(1, "Grapes");
        System.out.println("After update: " + list);

        // Check size
        System.out.println("Size of list: " + list.size());

        // Check if element exists
        System.out.println("Contains 'Apple'? " + list.contains("Apple"));

        // Sorting
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        ArrayList<Integer> obj2 = new ArrayList<>();
        obj2.add(300);
        obj2.add(300);
        obj2.add(300);
        obj2.add(300);

        ArrayList<Integer> obj3 = new ArrayList<>();
        obj3.add(200);
        obj3.add(201);
        obj3.add(200);
        obj3.add(200);

        obj2.addAll(1,obj3);
        System.out.println(obj2);

        // Lambda Expression
        obj3.removeIf(n->(n%2!=0));
        System.out.println(obj3);
    }
}
