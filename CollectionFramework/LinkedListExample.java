import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);  // Add at beginning
        linkedList.addLast(40);  // Add at end

        System.out.println("LinkedList: " + linkedList);

        // Remove elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removing first and last: " + linkedList);

        // Get elements
        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Last Element: " + linkedList.getLast());

        // Convert to array
        Object[] array = linkedList.toArray();
        System.out.print("Converted Array: ");
        //For each loop and using Object class to iterate over the array
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
    }
}
