import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        quickSortMethod(a, 0, a.length - 1);

        System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static void quickSortMethod(int[] a, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int middle = start + (end - start) / 2;
        int pivot = a[middle];

        while (start <= end) {

            // also a reason why if its already sorted it will not swap
            while (a[start] < pivot) {
                start++;
            }
            while (a[end] > pivot) {
                end--;
            }

            // When Start
            if (start <= end) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        quickSortMethod(a, low, end);
        quickSortMethod(a, start, high);
    }
}
