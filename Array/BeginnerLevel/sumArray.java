import java.util.Arrays;
import java.util.Scanner;

public class sumArray {
    void read(int[] c, Scanner sc) {
        System.out.println("Enter the elements: ");
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextInt();
        }
    }

    void display(int[] c) {
        System.out.println("The elements are: ");
        for (int i = 0; i < c.length; i++) {
            System.out.println("Element at index " + i + " is: " + c[i]);
        }
    }

    int SumFunction(int[] c) {
        int sum = 0;
        for (int num : c) {
            sum += num;
        }
        return sum;
    }

    void EvenOddSum(int[] c) {
        int even = 0, odd = 0;
        for (int num : c) {
            if (num % 2 == 0)
                even += num;
            else
                odd += num;
        }
        System.out.println("Even Sum = " + even + ", Odd Sum = " + odd);
    }

    int KeyElement(int[] c, Scanner sc) {
        System.out.print("Enter the key element: ");
        int key = sc.nextInt();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == key) return i + 1;
        }
        return -1;
    }

    int[] reverseArray(int[] arr) {
        int[] reverse = Arrays.copyOf(arr, arr.length);

        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = reverse[left];
            reverse[left] = reverse[right];
            reverse[right] = temp;
            left++;
            right--;
        }
        return reverse;
    }

    public static void main(String[] args) {
        sumArray sumArr = new sumArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
//
//        sumArr.read(arr, sc);
//        sumArr.display(arr);
//
//        int sum = sumArr.SumFunction(arr);
//        System.out.println("Sum of elements: " + sum);
//
//        sumArr.EvenOddSum(arr);
//
//        int pos = sumArr.KeyElement(arr, sc);
//        if (pos != -1) System.out.println("Element is present at position " + pos);
//        else System.out.println("Element not found!");
//
//        int[] arr2 = sumArr.reverseArray(arr);
//        System.out.println("Reversed array: " + Arrays.toString(arr2));
//
//        System.out.println("Displaying reversed array:");
//        for (int num : arr2) {
//            System.out.println(num);
//        }

        Class s = arr.getClass();
        String name = s.getName();
        System.out.println(name);
    }
}
