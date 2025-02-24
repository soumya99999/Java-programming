import java.util.Scanner;

public class FibonacciSearch {
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

        int pos = fibonacciSearchMethod(array, target);

        if(pos != -1)
            System.out.println("The Element " + array[pos] + " present in " + pos);
        else
            System.out.println("Not present");
    }

    private static int fibonacciSearchMethod(int[] a, int target) {

        int fib_1 = 0;
        int fib_2 = 1;
        int fib_3 = fib_1 + fib_2;

        while(fib_3 <= a.length){
            fib_1 = fib_2;    // 1   , 1    , 2   , 3    , 5
            fib_2 = fib_3;    // 1   , 2    , 3   , 5     , 8
            fib_3 = fib_1 + fib_2;  // 2   , 3  , 5   , 8  , 13
        }

        int offset = -1;

        while(fib_3 > 1){
            int i = Math.min(offset + fib_1 , a.length - 1);

            if(a[i] < target){
                fib_3 = fib_2;
                fib_2 = fib_1;
                fib_1 = fib_3 - fib_2;
                offset = i;
            }
            else if(a[i] > target){
                fib_3 = fib_1;
                fib_2 -= fib_3;
                fib_1  = fib_3 - fib_2;
            }
            else{
                return i;
            }
        }

        return -1;

    }
}
