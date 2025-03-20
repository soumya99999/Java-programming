import java.util.Arrays;
import java.util.Scanner;

public class LongestSubArrLen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key element = ");
        int key = sc.nextInt();

        int result = FindLongestArrLength(arr, key);
        System.out.println(result);

        int[] resultArr = FindSubArr(arr, key);
        System.out.println(Arrays.toString(resultArr));
    }

    private static int[] FindSubArr(int[] arr, int key) {
        int l = 0, r = 0;
        int[] result = new int[arr.length];
        int len = 0;
        int sum = 0;
        while (r < arr.length) {
            if (sum <= key)
                sum += arr[r];
            if (sum <= key && len < r - l + 1) {
                result = Arrays.copyOfRange(arr, l, r+1);
            }
            while (sum > key) {
                sum -= arr[l];
                l++;
            }
            r++;
        }
        return result;
    }

    private static int FindLongestArrLength(int[] arr, int key) {
        int l = 0, r = 0;
        int len = 0;
        int sum = 0;
        while (r < arr.length) {
            if (sum <= key)
                sum += arr[r];
            if (sum <= key) len = Math.max(len, r - l + 1);
            while (sum > key) {
                sum -= arr[l];
                l++;
            }
            r++;
        }
        return len;
    }
}
