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

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = a[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (a[s] < pivot) {
                s++;
            }
            while (a[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        quickSortMethod(a, low, e);
        quickSortMethod(a, s, high);
    }


}
