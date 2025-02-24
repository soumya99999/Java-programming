import java.util.Scanner;


// It will work on sorted array only
// it's Time complexity is O(n^1/2)
public class JumpSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.print("Enter the jump size (m): ");
        int m = sc.nextInt();

        System.out.print("Enter the element to search (n): ");
        int n = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int result = jumpSearch(array, m, n);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(n + " element found at position " + result);
        }
    }

    private static int jumpSearch(int[] array, int m, int n) {
        int length = array.length;
        int step = m;
        int prev = 0;


        // It will find the range in which the element is present
        while (array[Math.min(step, length) - 1] < n) { // - 1 bcz i am taking index 0
            prev = step;
            step += m;
            if (prev >= length) {
                return -1;
            }
        }

        // Next applying linear search to find the element
        for (int i = prev; i < Math.min(step, length); i++) {
            if (array[i] == n) {
                return i;
            }
        }

        return -1;
    }
}
