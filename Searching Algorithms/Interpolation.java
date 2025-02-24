import java.util.Scanner;


// It's time complexity is O(log(log n))
public class Interpolation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.print("Enter the element to find: ");
        int find = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter the array elements in sorted order: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int result = InterpolationMethod(array, find);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int InterpolationMethod(int[] array, int n) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high && n >= array[low] && n <= array[high]) {

            // If array is of one index
            if (array[high] == array[low]) {
                if (array[low] == n) {
                    return low;
                } else {
                    return -1;
                }
            }


            int pos = low + ((high - low) * (n - array[low])) / (array[high] - array[low]);


            // It may provide negative or greater index value
            if (pos < 0 || pos >= array.length) {
                return -1;
            }

            if (array[pos] == n) {
                return pos;
            }

            //if element is less than positioned value
            if (array[pos] < n) {
                low = pos + 1;
            }

            else {
                high = pos - 1;
            }
        }

        return -1;
    }
}
