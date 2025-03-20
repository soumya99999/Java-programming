import java.util.Scanner;

public class BinarySearchRec {
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
        int mid = array.length/2;
        System.out.println("Mid element is = "+ mid);

        int result = binarySearchRec(array, mid, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    private static int binarySearchRec(int[] arr, int mid,  int target){
        if(arr[mid] == target) return mid;
        else if(arr[mid] > target){
            return binarySearchRec(arr,mid/2,target);
        }
        else if(arr[mid] < target){
            return binarySearchRec(arr,(mid+arr.length)/2,target);
        }
        return -1;
    }
}
