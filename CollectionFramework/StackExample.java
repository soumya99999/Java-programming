import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack: " + stack);

        // Peek at the top element
        System.out.println("Top element (peek): " + stack.peek());

        // Popping an element (removes top element)
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // Searching for an element
        System.out.println("Position of 20: " + stack.search(20));

        // Popping remaining elements
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Final Stack: " + stack);
    }
}
