import java.util.Scanner;

public class MaxOnes111 {
    private static int FindMaxOnesLen(int[] arr, int key) {
        int l = 0, r = 0, maxLen = 0;
        int zeros = 0;
        while (r < arr.length) {
            if (arr[r] == 0) {
                zeros += 1;
            }

//            while(zeros > key){
//                if(arr[l] == 0) zeros--;
//                l++;
//            }
            if(zeros > key){
                if(arr[l] == 0) zeros--;
                l++;
            }

            if(zeros <= key) maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key element = ");
        int zeros = sc.nextInt();

        int length = FindMaxOnesLen(arr, zeros);
        System.out.println(length);
    }
}
