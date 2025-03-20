import java.util.Arrays;
import java.util.Scanner;

public class MaximumPointsSubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the key element = ");
        int constant = sc.nextInt();

        int result = FindSubArrSum(arr,constant);
        System.out.println(result);

        int[] resultArr = FindSubArrMax(arr,constant);
        System.out.println(Arrays.toString(resultArr));
    }

    private static int[] FindSubArrMax(int[] arr, int constant) {
        int LSum = 0, RSum = 0, maxSum = 0, maxIndex = arr.length - 1;
        int bestLeftCount = constant, bestRightCount = 0;

        for (int i = 0; i < constant; i++) {
            LSum += arr[i];
        }

        maxSum = LSum;

        for (int i = constant - 1, rightCount = 1; i >= 0; i--, rightCount++) {
            LSum -= arr[i];
            RSum += arr[maxIndex];
            maxIndex--;

            int currentSum = LSum + RSum;
            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestLeftCount = i;
                bestRightCount = rightCount;
            }
        }

        int[] leftSide = Arrays.copyOfRange(arr, 0, bestLeftCount);
        int[] rightSide = Arrays.copyOfRange(arr, arr.length - bestRightCount, arr.length);

        int[] result = new int[leftSide.length + rightSide.length];
        System.arraycopy(leftSide, 0, result, 0, leftSide.length);
        System.arraycopy(rightSide, 0, result, leftSide.length, rightSide.length);

        return result;
    }


    private static int FindSubArrSum(int[] arr, int constant) {
        int LSum = 0, RSum = 0, maxSum = 0, maxIndex = arr.length - 1;
        for(int i = 0;i < constant;i++){
            LSum += arr[i];
        }
        maxSum = LSum;
        for(int i = constant - 1;i >= 0;i--){
            LSum -= arr[i];
            RSum += arr[maxIndex];
            maxIndex--;
            maxSum = Math.max(maxSum,(LSum+RSum));
        }
        return maxSum;
    }
}
