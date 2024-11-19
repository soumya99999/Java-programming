

public class ArrayPart_1 {
    public static void main(String[] args) {
        // Declaring an array of integers
        int[] numbers;

// Initializing the array with a size of 5
        numbers = new int[5];

// Alternative way to declare and initialize an array
        int[] values = {1, 2, 3, 4, 5};

// Accessing and modifying array elements
        values[0] = 10; // sets the first element to 10
        System.out.println(values[0]); // prints the first element


        String[] names = {"Alice", "Bob", "Charlie"};
        System.out.println("First name: " + names[0]);



        int[] array = {1, 2, 3, 4, 5};

// Using a for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

// Using a for-each loop
        for (int element : array) {
            System.out.println("Element: " + element);
        }


        int[] array_min_max = {10, 3, 5, 2, 8};
        int min = array_min_max[0];
        int max = array_min_max[0];

        for (int num : array_min_max) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);

        int[] array_avg = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : array_avg) {
            sum += num;
        }

        double average = (double) sum / array_avg.length;
        System.out.println("Average of elements: " + average);


        int[] array_rev = {1, 2, 3, 4, 5};

        for (int i = 0; i < array_rev.length / 2; i++) {
            int temp = array_rev[i];
            array_rev[i] = array_rev[array_rev.length - 1 - i];
            array_rev[array_rev.length - 1 - i] = temp;
        }

        System.out.print("Reversed array: ");
        for (int num : array_rev) {
            System.out.print(num + " ");
        }

    }
}
