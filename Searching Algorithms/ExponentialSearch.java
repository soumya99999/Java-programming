import java.util.Scanner;

public class ExponentialSearch {
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

        int pos = ExponentialSearchMethod(array,target);

        if(pos != -1)
            System.out.println("The Element " + array[pos] + " present in " + pos);
        else
            System.out.println("Not present");
    }

    private static int ExponentialSearchMethod(int[] array , int target) {

        // First it's required to check the first 0 index otherwise inside while one infinite
        // loop for index = 0 * 2 will be continued
        if (array[0] == target)
            return 0;

        int index = 1;

        while(index < array.length -1 && array[index] <= target){
            index *= 2;
        }

        return BinarySearch(array, index/2, Math.min(index,array.length -1) , target);

    }

    public static int BinarySearch(int[] a,int l , int h,int x){
        while(l <= h){

            int mid = (l + h)/2;

            if(a[mid] == x){
                return mid;
            }

            if(a[mid] < x){
                l = mid + 1;
            }

            if(a[mid] > x){
                h = mid - 1;
            }
        }

        return -1;
    }
}
