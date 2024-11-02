import java.util.Scanner;

public class TernarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter the sorted array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();

        int result = ternarySearchMethod(array, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    private static int ternarySearchMethod(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid1 = low + (high - low) / 2;
            int mid2 = high - (high - low) / 2;

            if (array[mid1] == target) {
                return mid1;
            }
            if (array[mid2] == target) {
                return mid2;
            }
            if (array[mid1] > target) {
                high = mid1 - 1;
            } else if(array[mid1] < target){
               low = mid2 + 1;
            }
            else{
                low = mid1 + 1;
                high = mid2 -1;
            }
        }

        return -1;
    }
}