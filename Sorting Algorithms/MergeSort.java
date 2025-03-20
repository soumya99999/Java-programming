import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < a.length;i++){
            a[i] = sc.nextInt();
        }

        a = mergesort(a);
        System.out.println(Arrays.toString(a));
    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        System.out.println("Left Part = "+Arrays.toString(left));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        System.out.println("Right Part = "+Arrays.toString(right));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
