import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < a.length;i++){
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(selectionSortMethod(a)));
        Arrays.sort(a);


//        System.out.print("Sorted array: ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
    }

    private static int[] selectionSortMethod(int[] a) {
        for(int i = 0;i<a.length - 1; i++){
            int min = i;
            for(int j = i + 1;j < a.length ; j++){
                if(a[min] > a[j])
                    min = j;
            }

            if(min != i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
        return a;
    }
}
